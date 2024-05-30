package app;

import entidades.calculos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        calculos numero1, numero2, operacao;
        numero1 = new calculos();
        numero2 = new calculos();
        operacao = new calculos();
        boolean continuar;

        try{
            do {
                System.out.println();
                System.out.println("Olá! Usuario!");
                System.out.print("Digite o seu primeiro valor: ");
                numero1.numero1 = sc.nextDouble();

                System.out.println();
                System.out.println("Agora digite a operação que deseja: Adição(+), Subtração(-), Divisão(/), Multiplicação(*).");
                System.out.print("Digite a operação: (+, -, /, *): ");
                operacao.operacao = sc.next();

                System.out.println();
                System.out.print("Digite o seu segundo valor: ");
                numero2.numero2 = sc.nextDouble();

                System.out.println();
                double resultado = calculos.realizarCalculo(numero1.numero1, numero2.numero2, operacao.operacao);
                System.out.println("Resultado: "  + resultado);

                continuar = calculos.verificarNovaOperacao();
            }
            while (continuar);
        }
        catch (InputMismatchException ex){
            System.out.println("Olá! usuario queria avisar que os valores para calculo devem ser numéricos.");
        }









        sc.close();


    }
}
