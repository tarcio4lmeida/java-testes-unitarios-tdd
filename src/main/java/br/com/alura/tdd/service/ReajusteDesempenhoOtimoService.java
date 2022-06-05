package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteDesempenhoOtimoService implements CalculoReajuste {

    public void concederReajuste(Funcionario funcionario) {
        BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
        funcionario.reajustarSalario(reajuste);
    }
}