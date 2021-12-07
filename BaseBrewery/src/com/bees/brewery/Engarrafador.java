package com.bees.brewery;

public class Engarrafador extends Armazenamento {

    public Engarrafador() {
        altura = 10;
        largura = 15;
        profundidade = 10;
        tipoDeLiquido = "cerveja";
        temperaturaDoLiquido = 5.0F;
        tempoDeArmazenamento = 10;
    }


    public Boolean executar(Malte p) {
        try {
            Thread.sleep(tempoDeArmazenamento);

        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
