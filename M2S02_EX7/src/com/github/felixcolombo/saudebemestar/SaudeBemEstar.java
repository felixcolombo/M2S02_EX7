package com.github.felixcolombo.saudebemestar;

import java.util.Scanner;

public class SaudeBemEstar {
	
	private static Scanner keyboard = new Scanner(System.in);
	private String sexo;
	private double pesoAtual;
	private double altura;
	private double idade;
	private double horasAtividade;
	private double pesoPeder;
	private double constante;
	private double dieta;
	
	
	public void calculoCalorias() {
		
		do {
			System.out.println("Informe seu Sexo (M ou F): ");
			sexo = keyboard.nextLine().toLowerCase();
			if(!(sexo.equals("f")) && !(sexo.equals("m"))) {
				System.out.println("Sexo inválido! Digite novamente!");
			}			
		} while(!(sexo.equals("f"))&&!(sexo.equals("m")));
		
		System.out.println("Informe seu peso atual:");
		pesoAtual = keyboard.nextDouble();
		System.out.println("Informe sua altura em cm:");
		altura = keyboard.nextDouble();
		System.out.println("Informe sua idade:");
		idade = keyboard.nextDouble();
		System.out.println("Informe quantas horas você pratica atividade física:");
		horasAtividade = keyboard.nextDouble();
		do {
			System.out.println("Informe quantos quilos você deseja perder:");
			pesoPeder = keyboard.nextDouble();
			if(pesoPeder>3) {
				System.out.println("Perder mais do que 3 kg por mês pode ser prejudicial!");
			}
		}while(pesoPeder>3);
		
		if(sexo.equals("f")){
			constante = -161;
		} else {
			constante = 5;
		}
		
		dieta = ((10*pesoAtual+6.25*altura-5*idade+constante)+horasAtividade*400)-((pesoPeder*7000)/30);
		
		System.out.printf("Você precisa de uma dieta de: %.2fkcal por dia!", dieta);
	}
	
}
