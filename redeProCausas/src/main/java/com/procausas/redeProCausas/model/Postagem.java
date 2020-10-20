package com.procausas.redeProCausas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagem")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@NotNull
	@Size(min=5, max=100)
	private String postTitulo;
	
	//@NotNull
	@Size(min=10, max=10000)
	private String postTexto;
	
	//@NotNull
	private String postCidade;
	
	//@NotNull
	private String postEstado;
	
	//@NotNull
	private String postEndereco;
	
	private String postTag;
	
	private String postUrl;
	
	private String postImagem;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPostTitulo() {
		return postTitulo;
	}

	public void setPostTitulo(String postTitulo) {
		this.postTitulo = postTitulo;
	}

	public String getPostTexto() {
		return postTexto;
	}

	public void setPostTexto(String postTexto) {
		this.postTexto = postTexto;
	}

	public String getPostCidade() {
		return postCidade;
	}

	public void setPostCidade(String postCidade) {
		this.postCidade = postCidade;
	}

	public String getPostEstado() {
		return postEstado;
	}

	public void setPostEstado(String postEstado) {
		this.postEstado = postEstado;
	}

	public String getPostEndereco() {
		return postEndereco;
	}

	public void setPostEndereco(String postEndereco) {
		this.postEndereco = postEndereco;
	}

	public String getPostTag() {
		return postTag;
	}

	public void setPostTag(String postTag) {
		this.postTag = postTag;
	}

	public String getPostUrl() {
		return postUrl;
	}

	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
	}

	public String getPostImagem() {
		return postImagem;
	}

	public void setPostImagem(String postImagem) {
		this.postImagem = postImagem;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
