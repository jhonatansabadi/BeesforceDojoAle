package com.bees.brewery;

public class Beer {
    private Malte _malte;

    public Beer(Malte malte) {
        _malte = malte;
    }

    public boolean is_Full() {
        return _malte != null;
    }
}
