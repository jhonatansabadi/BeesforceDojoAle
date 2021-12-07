package com.bees.brewery;

import java.util.ArrayList;
import java.util.List;

public class Engarrafador extends Maquina {

    private TipoDeEnvase _tipoDeEnvase;

    private List<BotleBeer> _listDeGarrafas;

    public Engarrafador(TipoDeEnvase tipoDeEnvase) {
        capacidade = 100000.0f;
        taxaDePerdas = 10.0f;
        _tipoDeEnvase = tipoDeEnvase;
        _listDeGarrafas = new ArrayList<BotleBeer>();
    }

    public Boolean executar(Malte malte) {
        try {
            float perdaPorcentagem = taxaDePerdas / 100;
            float litros = capacidade * (1 - perdaPorcentagem);
            while(litros > 0){
                BotleBeer botleBeer  = new BotleBeer(malte, _tipoDeEnvase);
                litros = botleBeer.encherVasilhame(litros);
                botleBeer.close();
                _listDeGarrafas.add(botleBeer);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<BotleBeer> get_listDeGarrafas() {
        return _listDeGarrafas;
    }
}
