/* Fa�a um sistema que leia as 3 notas de um aluno e calcule
 a m�dia final deste aluno. Considerar que a m�dia � ponderada
 e que o peso das notas �: 2,3 e 5, respectivamente. */ 

package PacoteJava;
import java.util.Scanner;
public class ex05 {

	public static void main (String args[])
	{
		double nota1, nota2, nota3, media;
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Escreva a primeira nota: ");
		nota1 = leitura.nextDouble();
		
		System.out.println("Escreva a segunda nota: ");
		nota2 = leitura.nextDouble();
		
		System.out.println("Escreva a terceira nota: ");
		nota3 = leitura.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		System.out.println("A m�dia �: " + media);
	}
	
}
