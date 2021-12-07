package com.bees.brewery;

public class Engarrafador extends Maquina {

    private TipoDeEnvase _tipoDeEnvase;

    public Engarrafador(TipoDeEnvase tipoDeEnvase) {
        _tipoDeEnvase = tipoDeEnvase;
    }


    public Boolean executar(Malte malte) {
        try {
            BotleBeer botleBeer  = new BotleBeer(malte, _tipoDeEnvase);
            botleBeer.encherVasilhame();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
