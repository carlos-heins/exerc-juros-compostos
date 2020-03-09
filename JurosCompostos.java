/**
 * Um Projeto que calcula juros compostos
 * 
 * @author Carlos de Souza 
 * @version 08/03/2020
 */

import java.util.Scanner;
public class JurosCompostos
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in); 
        double  money, rate, amount;
        int year;
        
        System.out.println("Digite a quantidade de dinheiro: ");
        money = scan.nextDouble();
        System.out.println("Digite a taxa de juros: ");
        rate = scan.nextDouble();
        System.out.println("Por quantos anos? ");
        year = scan.nextInt();
        
    for (int x = 1; x <= year; x ++){
        amount = money * Math.pow(1.0 +rate , x);
        System.out.println("Ano: "+x+" - Montante: "+ amount);
    }
    }
}
