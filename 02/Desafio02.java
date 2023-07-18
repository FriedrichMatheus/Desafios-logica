package desafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Desafio02 {
	
	private static final String PL = "\n";
	
	public static void main(String[] args) {
		List<BigDecimal> notasList = new ArrayList<>();
		notasList.add(new BigDecimal(100.00));
		notasList.add(new BigDecimal(50.00));
		notasList.add(new BigDecimal(20.00));
		notasList.add(new BigDecimal(10.00));
		notasList.add(new BigDecimal(5.00));
		notasList.add(new BigDecimal(2.00));
		notasList.add(new BigDecimal(1.00));
		notasList.add(new BigDecimal(0.50));
		notasList.add(new BigDecimal(0.25));
		notasList.add(new BigDecimal(0.10));
		notasList.add(new BigDecimal(0.05));
		notasList.add(new BigDecimal(0.01));
		
		
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		System.out.println("Insira o valor desejado:");
		
		BigDecimal valorInput = new BigDecimal(scanner.nextFloat()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		StringBuilder notasOutput = new StringBuilder();
		StringBuilder moedasOutput = new StringBuilder();
		
		for(BigDecimal notaVal : notasList) {

			valorInput = valorInput.setScale(2, BigDecimal.ROUND_HALF_EVEN);
			notaVal = notaVal.setScale(2, BigDecimal.ROUND_HALF_EVEN);
			
			int count = 0;
			while(valorInput.compareTo(notaVal.abs()) >= 0) {
				valorInput = valorInput.add(notaVal.negate());
				count++;
			}
			
			if(notaVal.compareTo(BigDecimal.ONE) == 1) {
				notasOutput.append(count + " nota(s)  de R$ " + notaVal + " " + PL);
				continue;
			}
			
			moedasOutput.append(count + " moeda(s)  de R$ " + notaVal + " " + PL);
		}
		
		System.out.println("NOTAS: " + PL);
		System.out.println(notasOutput.toString());
		System.out.println("MOEDAS: " + PL);
		System.out.println(moedasOutput.toString());
		
		scanner.close();
		System.out.println("Fim");
	}
}
