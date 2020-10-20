package com.procausas.redeProCausas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.procausas.redeProCausas.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Usuario> findAllByUsuarioNomeContainingIgnoreCase (String usuarioNome);
	public Optional<Usuario> findByUsuarioEmailAndUsuarioSenha(String usuarioEmail,String usuarioSenha);
	public Optional<Usuario> findByUsuarioEmail(String usuarioEmail);
	public Optional<Usuario> findByUsuarioId(Long usuarioId);
	public Optional<Usuario> findByUsuarioNome(String usuarioNome);
}
