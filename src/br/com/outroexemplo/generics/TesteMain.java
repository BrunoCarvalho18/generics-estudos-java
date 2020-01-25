package br.com.outroexemplo.generics;

public class TesteMain {
	
	public static void main(String[] args) {
		
		Teste<String, Integer> objeto = new Teste<String,Integer>("Bruno",24);
		objeto.printar();
	}

}
