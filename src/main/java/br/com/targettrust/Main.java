package br.com.targettrust;

import java.util.Map;

public class Main {
    public static void main(String[] args)  {

        Maquina maquina = new Maquina();

        FluxoRecarga recarga = new FluxoRecarga();

        Map<Integer, Fileira> map = recarga.executar();
        maquina.setFileiraSnack(map);

        for(Map.Entry<Integer, Fileira> fileira : maquina.getFileiraSnack().entrySet()){
            System.out.println(fileira.getKey() + " - " + fileira.getValue());
        }

        FluxoAtendimento atendimento = new FluxoAtendimento();
        atendimento.executar(maquina);

    }
}