package br.com.targettrust;

public class Rede implements Adquirente {
    @Override
    public void processarPagamento(String numero, String validade, String ccv) {
        System.out.println("O pagamento será realizado pela Rede");
    }
}
