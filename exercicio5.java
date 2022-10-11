import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        //Faça um Programa que converta metros para centímetros.
        System.out.println("Digite uma Medida em Metros: ");

        double metros;
        double resultado;
         
        // 1) Ação do usuario: Informar metros 
        Scanner teclado = new Scanner(System.in);
        metros = teclado.nextDouble();
        teclado.close();

        // 2) Tarefa do programa: Transformar em centimetros
        resultado = metros * 100;

        // 3) Resposta do programa: conversão metros para centimetros 
        System.out.print("centimetros:");
        System.out.print(resultado);



    




    }
    
}
