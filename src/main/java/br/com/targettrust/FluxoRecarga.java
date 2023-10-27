package br.com.targettrust;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static br.com.targettrust.Maquina.NUMERO_MAXIMO_FILEIRAS;

public class FluxoRecarga {

    public Map<Integer, Fileira> executar(){

        Map<Integer, Fileira> fileiras = new HashMap<>();

        String path = System.getProperty("user.dir");
        String caminhoArquivo = path + File.separator + "snack.txt";

        FileReader fileReader = null;
        BufferedReader br = null;

        try {

            fileReader = new FileReader(caminhoArquivo);
            br = new BufferedReader(fileReader);

            String linha;

            int contadorFileiras = 0;

            while ((linha = br.readLine()) != null) {

                contadorFileiras++;

                if(contadorFileiras > NUMERO_MAXIMO_FILEIRAS) {
                    throw new FileiraInvalidaException("Número máximo de fileiras excedido");
                }

                String[] informacoes = linha.split(";");

                Produto produto = new Produto();
                produto.setCodigo(Integer.valueOf(informacoes[0]));
                produto.setNome(informacoes[1]);
                produto.setPreco(Double.valueOf(informacoes[2]));

                Fileira fileira = new Fileira();
                fileira.setStatus(FileiraStatusEnum.COM_PRODUTO);
                fileira.setQuantidadeProduto(Integer.parseInt(informacoes[3]));
                fileira.setProduto(produto);

                fileiras.put(Integer.valueOf(informacoes[0]), fileira);

                System.out.println(linha);

            }
        } catch (Exception e) {
            System.out.println("Aconteceu um erro " + e.getMessage());
        }
        finally {

            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            if(fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

        }

        return fileiras;
    }
}
