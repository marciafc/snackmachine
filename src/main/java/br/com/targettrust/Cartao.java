package br.com.targettrust;

import java.util.Scanner;

public class Cartao extends FormaPagamento {

    @Override
    public void realizarPagamento() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do cartão");
        String numero = scanner.next();

        System.out.println("Digite a validade do cartão");
        String validade = scanner.next();

        System.out.println("Digite o CCV");
        String ccv = scanner.next();

        // TODO implementar integracao com adquirentes
        System.out.println("Informe a adquirente 1 Getnet, 2 Rede");
        int codigoAdquirente = scanner.nextInt();

        Adquirente adquirente = null;
        if(codigoAdquirente == 1) {
            adquirente = new Getnet();
        } else if (codigoAdquirente == 2) {
            adquirente = new Rede();
        } else {
            System.out.println("Código inválido");
        }

        if(adquirente != null) {
            adquirente.processarPagamento(numero, validade, ccv);
        }
    }
}
