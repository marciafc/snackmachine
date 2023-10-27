package br.com.targettrust;

import java.util.Map;

public class Maquina {

    public static final Integer NUMERO_MAXIMO_FILEIRAS = 12;

    private Map<Integer, Fileira> fileiraSnack;

    public Map<Integer, Fileira> getFileiraSnack() {
        return fileiraSnack;
    }

    public void setFileiraSnack(Map<Integer, Fileira> fileiraSnack) {
        this.fileiraSnack = fileiraSnack;
    }
}
