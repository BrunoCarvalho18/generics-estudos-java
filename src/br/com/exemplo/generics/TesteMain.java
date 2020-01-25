package br.com.exemplo.generics;

public class TesteMain {
	
	public static void main(String[] args) {
		
		Teste<Integer> iObjeto = new Teste<Integer>(15);
		System.out.println(iObjeto.getObjecto());
		
		Teste<String> sObjeto = new Teste<String>("Bruno Aprendendo Java");
		System.out.println(sObjeto.getObjecto());
	}

}
