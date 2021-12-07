package com.bees.brewery;

public class Resfriador extends Maquina{
    @Override
    public Boolean executar(Malte p) {
        try{
            Thread.sleep(tempoDeExecucao);
            p.set_isCold(true);
        } catch (InterruptedException ex){
            System.out.println(ex);
            return false;
        }

        return true;
    }
}
