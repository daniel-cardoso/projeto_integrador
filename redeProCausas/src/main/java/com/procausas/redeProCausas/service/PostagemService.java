package com.procausas.redeProCausas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procausas.redeProCausas.model.Postagem;
import com.procausas.redeProCausas.model.Usuario;
import com.procausas.redeProCausas.repository.UsuarioRepository;


@Service
public class PostagemService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<Postagem> minhasPostagem (Long id) {
		Usuario usuario = repository.findById(id).get();
		List<Postagem> listaPostagem = repository.save(usuario).getPostagem();
		return listaPostagem;
	}

}