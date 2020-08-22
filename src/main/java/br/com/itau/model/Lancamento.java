package br.com.itau.model;

public class Lancamento {
	
	  private Integer id;
	  private Double valor;
	  private String origem;
	  private Integer categoria;	  
	  private Integer mesLancamento;
	  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public Integer getCategoria() {
		return categoria;
	}
	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	public Integer getMesLancamento() {
		return mesLancamento;
	}
	public void setMesLancamento(Integer mesLancamento) {
		this.mesLancamento = mesLancamento;
	}
}
