package main.DesafioCodigo01;

import java.util.Scanner;

public class PositivosMedia {
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     int totalPositivos = 0;
	     double totalSomaPositivos = 0;
	     
        for (int i = 0; i < 6; i++) {
        	double atualNumber = scan.nextDouble();
        	if (atualNumber >= 0) {
        	  totalPositivos += 1;
        	  totalSomaPositivos += atualNumber;
        	}
        }
        
        double media = totalSomaPositivos / totalPositivos;
        
        System.out.println(totalPositivos + " valores positivos");
        System.out.println(String.format("%.1f", media));
	}
}
