package com.bees.brewery;

public class Fermentador extends Maquina {

    public Fermentador(){
        tempoDeExecucao = 7000;
    }
    @Override
    public Boolean executar(Malte malte) {
        try{
            malte.set_hasFerment(true);
            Thread.sleep(tempoDeExecucao);
            malte.set_isFermented(true);
            malte.set_hasFerment(false);
        } catch (InterruptedException ex){
            System.out.println(ex);
            return false;
        }
        return true;
    }

}
