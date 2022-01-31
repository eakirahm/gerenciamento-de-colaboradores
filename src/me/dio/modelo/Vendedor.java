package me.dio.modelo;

public class Vendedor extends FuncionarioCLT implements CalcularBonificacao {

    private Double valorBonificacao;

    public Vendedor() {

    }

    public Vendedor(String nome, String documento, Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    @Override
    public void calculateBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = super.getValorSalario() * porcentagemBonificacao;
    }

    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome ='" + nome + '\'' +
                ", documento ='" + documento + '\'' +
                ", endereco =" + endereco.getRua() +
                ", valorSalario =" + valorSalario +
                ", valorDaBonificacao =" + valorBonificacao +
                '}';
    }

}
