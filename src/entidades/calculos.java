package entidades;

import java.util.Locale;
import java.util.Scanner;

public class calculos {

    public double numero1;
    public double numero2;
    public String operacao;

    public static double realizarCalculo(double numero1, double numero2, String operacao){
        double respostaCalculo = 0.0;

        switch (operacao){
            case "+":
                respostaCalculo = numero1 + numero2;
                break;
            case "-":
                respostaCalculo = numero1 - numero2;
                break;
            case "*":
                respostaCalculo = numero1 * numero2;
                break;
            case "/":
                respostaCalculo = numero1 / numero2;
                break;

            default:
                System.out.println("Operação Invalida!");
                return Double.NaN;
        }
        return respostaCalculo;
    }
    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Deseja realizar uma nova operação? (S ou N): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
}
