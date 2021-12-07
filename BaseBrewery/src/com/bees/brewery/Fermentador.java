package com.bees.brewery;

public class Fermentador extends Maquina {

    public Fermentador(){
        tempoDeExecucao = 7000;
    }
    @Override
    public Boolean executar(Malte p) {
        try{
            p.set_hasFerment(true);
            Thread.sleep(tempoDeExecucao);
            p.set_isFermented(true);
            p.set_hasFerment(false);
        } catch (InterruptedException ex){
            System.out.println(ex);
            return false;
        }
        return true;
    }
}
