package br.com.aula1.beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "aula")
@SessionScoped
public class AulaMB {
	
	public AulaMB()
	{
		nome = "Marcelo";
	}
	
	private String nome;
	private final String CONSTANTE = "Essa é uma constante";
		
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void HelloWord()
	{
		
	}
}