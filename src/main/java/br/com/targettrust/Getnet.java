package br.com.targettrust;

public class Getnet implements Adquirente {
    @Override
    public void processarPagamento(String numero, String validade, String ccv) {
        System.out.println("Pagamento será realizado pela Getnet");
    }
}
