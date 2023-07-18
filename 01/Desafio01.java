package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira a quantidade de linhas!");

		Integer numLinhas = scanner.nextInt();

		List<Integer> parList = new ArrayList<>(); 
		List<Integer> imparList = new ArrayList<>(); 
		
		for (int j = 0; j < numLinhas; j++) {
			System.out.println("Insira o " + (j + 1) + "º valor");
			
			Integer integerVal = scanner.nextInt();
			if(integerVal % 2 == 0) {
				parList.add(integerVal);
				continue;
			}
			imparList.add(integerVal);
		}
		
		parList.sort((a, b) -> a - b);
		imparList.sort((a, b) -> b - a);
		
		List<Integer> resultList = new ArrayList<>();
		resultList.addAll(parList);
		resultList.addAll(imparList);
		
		System.out.println("Resultado:");
		resultList.forEach(i -> {
			System.out.println(i);
		});
		
		
		scanner.close();
		System.out.println("Fim");
	}
	
}
