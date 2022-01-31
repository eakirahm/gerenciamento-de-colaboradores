package me.dio;

import me.dio.modelo.Endereco;
import me.dio.modelo.Gerente;
import me.dio.modelo.OperadorDeCaixa;
import me.dio.modelo.Vendedor;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Avenida Affonso Penna", "Próximo à UPA ZL", "Aparecida");

        // Vendedor vendedor = new Vendedor();

        Vendedor vendedor = new Vendedor("Vendedor", "48613565", endereco, 1250d);
        vendedor.calculateBonificacao(0.1d);

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Operador de caixa", "4568331", endereco, 1500d);

        System.out.println(vendedor);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();

        gerente.setNome("Carlos");
        gerente.setDocumento("32548339");
        gerente.setHorasTrabalhadas(40);
        gerente.setValorHora(50d);
        gerente.setEndereco(endereco);

        gerente.calcularRemuneracao();
        gerente.calculateBonificacao(0.2d);

        System.out.println(gerente);
    }
}
