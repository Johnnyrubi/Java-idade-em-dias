package com.trybe.idadeemdias;

public class Pessoa {
  public Long calcularIdadeEmDias(int anos, int meses, int dias) {
    Long idade = (long) ((anos * 365) + (meses * 30) + dias);
    return idade;

  }
}
