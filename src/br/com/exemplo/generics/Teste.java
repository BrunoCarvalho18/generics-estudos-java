package br.com.exemplo.generics;

public class Teste<T> {
	
	T objeto;
	
	public Teste(T objeto) {
		this.objeto = objeto;
	}
	
	public T getObjecto() {
		return this.objeto;
		
	}
	

}
