import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double peso;
        int escolha;

        System.out.println("Olá, seja bem vindo a programa de conversão de peso!");
        System.out.println("Por favor, selecione umas das opções abaixo: ");
        System.out.println("(1) - Converter Libras para Quilos");
        System.out.println("(2) - Converter Quilos para Libras");

        escolha = scanner.nextInt();

        if(escolha == 1){
            System.out.println("Digite quantas Libras quer transformar em Quilos: ");
            peso = scanner.nextDouble();
            peso = peso * 0.4536;

            System.out.println("O total da conversão de Libras para Quilos foi: " + peso);
        }
        else if(escolha == 2){
            System.out.println("Digite quantos Quilos quer transformar em Libras: ");
            peso = scanner.nextDouble();
            peso = peso * 2.2046;
            System.out.println("O total da conversão de Quilos para libra foi: " + peso);
        }
        else{
            System.out.println("Digite uma opção válida.");
        }

        scanner.close();

    }

}
