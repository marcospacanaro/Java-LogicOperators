/* Escreva  um sistema que leia três números inteiros e positivos 
 (A, B, C) e calcule a seguinte expressão: D = (R+S)/2, onde R = (A+B)² e S = (B+C)² */

package PacoteJava;
import java.util.Scanner;
public class ex04 {

	public static void main (String args[])
	{
		Scanner leitura = new Scanner(System.in);
		int a, b, c;
		double r, s, d;
		
		System.out.printf("Digite o valor de A: ");
		a = leitura.nextInt();
		
		System.out.printf("Digite o valor de B: ");
		b = leitura.nextInt();
		
		System.out.printf("Digite o valor de C: ");
		c = leitura.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s) / 2;
		
		System.out.println("O valor de D é: " + d);
		
		/* System.out.println(r);
		System.out.println(s); */
		
		
	}
	
}
