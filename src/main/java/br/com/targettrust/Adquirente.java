package br.com.targettrust;

public interface Adquirente {

    void processarPagamento(String numero, String validade, String ccv);
}
