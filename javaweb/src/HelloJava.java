package javaweb.src;

import java.util.Scanner;

public class HelloJava {
   public static void main(String[] args) {
      // Criar um objeto Scanner para entrada de dados
      Scanner scanner = new Scanner(System.in);

      // Solicitar o nome do usuário
      System.out.print("Digite seu nome: ");
      String nome = scanner.nextLine();

      // Exibir uma mensagem personalizada
      System.out.println("Olá, " + nome + "! Seja bem-vindo ao mundo do Java.");

      // Fechar o Scanner
      scanner.close();
   }
}
