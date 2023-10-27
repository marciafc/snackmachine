package br.com.targettrust;

import java.util.ArrayList;
import java.util.Scanner;

public class FluxoAtendimento {

    public void executar(Maquina maquina) {

        System.out.println("Digite o código do produto");

        Scanner scanner = new Scanner(System.in);
        int codigoProduto = scanner.nextInt();

        Fileira fileira = maquina.getFileiraSnack().get(codigoProduto);
        if(fileira != null) {

            System.out.println("Informações do produto");
            System.out.println("Nome do produto " + fileira.getProduto().getNome());
            System.out.println("Valor R$ " + fileira.getProduto().getPreco());

            System.out.println("Informe a forma de pagamento 1 para dinheiro, 2 para cartão[crédito ou débito]");
            int formaPagamento = scanner.nextInt();

            FormaPagamento pagamento = null;
            if(formaPagamento == 1) {
                pagamento = new Dinheiro();
            } else if(formaPagamento == 2){
                pagamento = new Cartao();
            } else {
                System.out.println("Forma de pagamento não é válida");
            }

            if(pagamento != null) {
                pagamento.realizarPagamento();
            }

        } else {
            System.out.println("Código informado não existe!");
        }

    }
}
