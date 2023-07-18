package desafio;

import java.util.Scanner;

public class Desafio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira a quantidade de linhas!");
		Integer numLinhas = scanner.nextInt();
		
		// https://www.freecodecamp.org/news/java-scanner-nextline-call-gets-skipped-solved/
		// https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
		scanner.nextLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < numLinhas; i++) {
			System.out.println("Insira a " + (i + 1) + "ª palavra:");
			String input = scanner.nextLine();
			
			char[] charArr = input.toCharArray();
			
			
			String left = "";
			String right = "";
			for(int j = 0; j < charArr.length/2; j++) {
					left += "" + charArr[(charArr.length/2 - j) - 1];
					right += "" + charArr[(charArr.length - j) - 1];
			}
			
			sb.append(left + right + " \n");
			
		}
		
		System.out.println("RESULTADO:");
		System.out.println(sb.toString());
		
		
		scanner.close();
		System.out.println("Fim");

	}
}
