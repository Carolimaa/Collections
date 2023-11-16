package Collectiions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExArrayList1 {

	public static void main(String[] args) {
		int i;
		String cor;
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList();
		
		for(i=0; i<5; i++) {
			System.out.printf("\nDigite a cor: ",(i+1));
			cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores: ");
		System.out.println(cores);

		Collections.sort(cores);
		System.out.println("\nOrdenar as cores");
		System.out.println(cores);

	}

}
