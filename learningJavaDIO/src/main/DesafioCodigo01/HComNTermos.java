package main.DesafioCodigo01;

import java.util.Scanner;

public class HComNTermos {
	public static void main(String[] Args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		  
		 double h = 0;
		 for (int i = 1; i <= n; i++) {
		    h += 1.0 / i;
		 }
		 
		 System.out.print(Math.round(h));
   }
}
