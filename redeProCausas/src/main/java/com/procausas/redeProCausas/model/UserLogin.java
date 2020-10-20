package com.procausas.redeProCausas.model;

public class UserLogin {
	
	private long usuarioId;
	
	private String usuarioNome;
	
	private String usuarioEmail;
	
	private String usuarioSenha;
	
	private String usuarioToken;
	
	private String usuarioImagemUrl;
	
	private boolean usuarioAdmin;

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

	public String getUsuarioToken() {
		return usuarioToken;
	}

	public void setUsuarioToken(String usuarioToken) {
		this.usuarioToken = usuarioToken;
	}

	public String getUsuarioImagemUrl() {
		return usuarioImagemUrl;
	}

	public void setUsuarioImagemUrl(String usuarioImagemUrl) {
		this.usuarioImagemUrl = usuarioImagemUrl;
	}
	
	public long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public boolean isUsuarioAdmin() {
		return usuarioAdmin;
	}

	public void setUsuarioAdmin(boolean usuarioAdmin) {
		this.usuarioAdmin = usuarioAdmin;
	}
	
}
