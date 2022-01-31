package me.dio.modelo;

public class OperadorDeCaixa extends FuncionarioCLT {

    public OperadorDeCaixa() {
    }

    public OperadorDeCaixa(String nome, String documento, Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome ='" + nome + '\'' +
                ", documento ='" + documento + '\'' +
                ", endereco =" + endereco.getRua() +
                ", valorSalario =" + valorSalario +
                '}';
    }
}
