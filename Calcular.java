package ATIVIDADES;

import java.util.Scanner;

public class Calcular {
	public static void main(String[] args) {

		Calculadora res = new Calculadora();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		res.v1 = entrada.nextDouble();

		System.out.println("Digte o operador: ");
		res.operador = entrada.next();

		System.out.println("Digite o segundo valor:");
		res.v2 = entrada.nextDouble();

		switch (res.operador) {

		case "+":
			System.out.println(res.v1 + " + " + res.v2 + " = " + res.somar());
			break;
			
		case "-":
			System.out.println(res.v1 + " - " + res.v2 + " = " + res.Subtracao());
			break;
		
		case "*":
			System.out.println(res.v1 + " * " + res.v2 + " = " + res.multiplicacao());
			break;
		
		case "/":
			if(res.v2<=0) {
				System.out.println(res.v1 + " Nao pode ser dividido  por numero menor ou igual a zero ");
			break;
			
			}else{
			System.out.println(res.v1 + " / " + res.v2 + " = " + res.divisao());
			break;
			}
			
		default:
			System.out.println("Operador nao encontrado tente novamente!");
		}

		entrada.close();

	}

}
