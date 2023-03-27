package com.example.demo.model;

public class Mensagem {
		private long id;
		private String mensagem;
		public Mensagem(long id, String mensagem) {
			super();
			this.id = id;
			this.mensagem = mensagem;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
		
		
}
