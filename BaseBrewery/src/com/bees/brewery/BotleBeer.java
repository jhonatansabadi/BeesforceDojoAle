package com.bees.brewery;

public class BotleBeer {
    private Malte _malte;

    private boolean _isClosed;

    public BotleBeer(Malte malte) {
        _malte = malte;
    }

    public void close(){
        _isClosed = true;
    }

    public boolean is_Full() {
        return _malte != null;
    }
}
