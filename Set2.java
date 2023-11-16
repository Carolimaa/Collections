package Collectiions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		  Set<Integer> valores = new HashSet<>();
	        int numSecreto;
	        Scanner input = new Scanner(System.in);

	        for (int i = 0; i < 10; i++) {
	            System.out.println("\nDigite o valor do número: " + (i + 1));
	            int valor = input.nextInt();
	            valores.add(valor);
	        }

	        System.out.println("\nDigite o número que deseja encontrar: ");
	        numSecreto = input.nextInt();

	        boolean encontrado = valores.contains(numSecreto);

	        if (encontrado) {
	            System.out.println("O número " + numSecreto + " foi encontrado.");
	        } else {
	            System.out.println("O número não foi encontrado.");
	        }
	    }
	}