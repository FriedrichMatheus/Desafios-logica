package desafio;

import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Insira o tamanho do array:");
		int arrSize = scanner.nextInt();
		
		System.out.println("Insira o alvo:");
		int target = scanner.nextInt();
		

		int[] arr = new int[arrSize];
		for(int i = 0; i < arrSize; i++) {
			System.out.println("Insira o " + (i + 1) + "º valor");
			
			arr[i] = scanner.nextInt();
		}
		
		int count = 0;
		for(int x = 0; x < arrSize; x++) {
			int valUm = arr[x];
			
			for(int y = 0; y < arrSize; y++) {
				int valDois = arr[y];
				
				if(valUm - valDois == target) count++;
			}
		}
		
		System.out.println("Quantidade: " + count);
		
		scanner.close();
		System.out.println("Fim");
	}
}
