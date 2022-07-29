package com.trybe.idadeemdias;

import java.util.Scanner;

public class Main {
  /**
   * class main.
   */
  public static void main(String[] args) {
    Pessoa qualquer = new Pessoa();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual é o seu nome?");
    String nome = scanner.next();
    System.out.println("Qual é sua idade em anos, meses e dias?");
    System.out.println("anos:");
    String ano = scanner.next();
    System.out.println("meses:");
    String meses = scanner.next();
    System.out.println("dias:");
    String dias = scanner.next();

    int a = Integer.parseInt(ano);
    int b = Integer.parseInt(meses);
    int c = Integer.parseInt(dias);

    Long result = qualquer.calcularIdadeEmDias(a, b, c);
    System.out.println("Olá " + nome + ", sua idade em dias é " + result);
    scanner.close();
  }

}