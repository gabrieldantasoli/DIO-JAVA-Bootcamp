package main.DesafioCodigo01;

import java.util.Scanner;

public class Dragao {
	public static void main(String[] args){
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);

        casos = ler.nextInt();

        for(int i = 0; i < casos; i++){
            poderDeLuta = ler.nextInt();

            if(poderDeLuta > 8000){
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
        }
	}
}
