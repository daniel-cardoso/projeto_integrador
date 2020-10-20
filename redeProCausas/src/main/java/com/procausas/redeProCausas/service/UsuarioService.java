package com.procausas.redeProCausas.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.Module.SetupContext;
import com.procausas.redeProCausas.model.UserLogin;
import com.procausas.redeProCausas.model.Usuario;
import com.procausas.redeProCausas.repository.UsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;

	public Usuario CadastrarUsuario(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(usuario.getUsuarioSenha());
		usuario.setUsuarioSenha(senhaEncoder);

		return repository.save(usuario);
	}

	public Optional<UserLogin> Logar(Optional<UserLogin> user) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Usuario> usuario = repository.findByUsuarioEmail(user.get().getUsuarioEmail());

		if (usuario.isPresent()) {
			if (encoder.matches(user.get().getUsuarioSenha(), usuario.get().getUsuarioSenha())) {

				String auth = user.get().getUsuarioEmail() + ":" + user.get().getUsuarioSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);

				user.get().setUsuarioToken(authHeader);				
				user.get().setUsuarioNome(usuario.get().getUsuarioNome());
				user.get().setUsuarioId(usuario.get().getId());
				user.get().setUsuarioImagemUrl(usuario.get().getUsuarioImagemUrl());
				user.get().setUsuarioAdmin(usuario.get().isUsuarioAdmin());
				

				return user;

			}
		}
		return null;
	}

}
