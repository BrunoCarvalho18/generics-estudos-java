package br.com.outroexemplo.generics;

public class Teste<T, U> {

	T objeto1;
	U objeto2;

	public Teste(T objeto1, U objeto2) {
		this.objeto1 = objeto1;
		this.objeto2 = objeto2;
	}

	public T getObjecto1() {
		return this.objeto1;
    }
	
	public U getObjeto2() {
		return this.objeto2;
	}
	
	
	public void printar() {
		System.out.println(objeto1);
		System.out.println(objeto2);
	}

}
