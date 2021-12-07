package com.bees.brewery;

public class Misturador extends Maquina {

    public Misturador(){
        capacidade = 90.0f;
        vazao = 5.0f;
        taxaDePerdas = 1.0f;
        tempoDeExecucao = 600;
    }

    @Override
    public Boolean executar(Malte p) {
        try{
            Thread.sleep(tempoDeExecucao);
            p.set_isMusted(true);
        } catch (InterruptedException ex){
          System.out.println(ex);
          return false;
        }

        return true;
    }
}
