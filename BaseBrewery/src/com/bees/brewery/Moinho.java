package com.bees.brewery;

public class Moinho extends Maquina {

    public Moinho(){
        capacidade = 10.0f;
    }

    @Override
    public Boolean executar(Malte malte) {
        return moer(malte);
    }

    private boolean moer(Malte malte) {
        int qntd = malte.get_Quantidade();
        int counter = 0;
        for (int i = 0; i < qntd; i++) {
            try {
                Thread.sleep(10);
                counter++;

                malte.set_quantidadeMoida(counter);
                malte.set_quantidadeInicial(malte.get_Quantidade() - 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

}
