package com.bees.brewery;

public class BotleBeer {
    private Malte _malte;

    private boolean _isClosed;

    private TipoDeEnvase _tipoDeEnvase;

    private float _capacidadeEmMililitros;

    private boolean _estaCheio;

    public BotleBeer(Malte malte, TipoDeEnvase tipoDeEnvase) {
        _malte = malte;
        _tipoDeEnvase = tipoDeEnvase;
    }

    public void close() {
        _isClosed = true;
    }


    public void encherVasilhame() {
        switch (_tipoDeEnvase) {
            case LATA:
                _capacidadeEmMililitros = 350.0f;
                break;
            case LONG_NECK:
                _capacidadeEmMililitros = 330.0f;
                break;
            case LITRAO:
                _capacidadeEmMililitros = 1000.0f;
                break;
        }

        // calcular a quantidade de liquido final;
        // subtrair capacidade em ml's de malte;
        // engarrafador = lista vazia de BotleBeer e as enche elas
    }


    public boolean get_estaCheio() {
        return _estaCheio;
    }


}
