package com.procausas.redeProCausas.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name ="tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long usuarioId;
	
	@NotNull
	@Size(min = 2, max = 100)
	private String usuarioNome;
	
	@NotNull
	@Size(min = 10, max = 50)
	@Email
	@Column(unique = true)
	private String usuarioEmail;
	
	@NotNull
	@Size(min = 8, max = 500)
	private String usuarioSenha;
	
	@NotNull
	private Date usuarioNascimento;
	
	private String usuarioImagemUrl;
	
	private boolean usuarioAdmin;
	
	@NotNull
	@Size(min = 5, max = 14)
	@Column(unique = true)
	private String usuarioDocumento;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	public long getId() {
		return usuarioId;
	}

	public void setId(long id) {
		this.usuarioId = id;
	}

	public String getUsuarioNome() {
		return usuarioNome;
	}

	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}

	public String getUsuarioEmail() {
		return usuarioEmail;
	}

	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

	public String getUsuarioSenha() {
		return usuarioSenha;
	}

	public void setUsuarioSenha(String usuarioSenha) {
		this.usuarioSenha = usuarioSenha;
	}

	public Date getUsuarioNascimento() {
		return usuarioNascimento;
	}

	public void setUsuarioNascimento(Date usuarioNascimento) {
		this.usuarioNascimento = usuarioNascimento;
	}

	public String getUsuarioDocumento() {
		return usuarioDocumento;
	}

	public void setUsuarioDocumento(String usuarioDocumento) {
		this.usuarioDocumento = usuarioDocumento;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

	public String getUsuarioImagemUrl() {
		return usuarioImagemUrl;
	}

	public void setUsuarioImagemUrl(String usuarioImagemUrl) {
		this.usuarioImagemUrl = usuarioImagemUrl;
	}

	public boolean isUsuarioAdmin() {
		return usuarioAdmin;
	}

	public void setUsuarioAdmin(boolean usuarioAdmin) {
		this.usuarioAdmin = usuarioAdmin;
	}
	

}
