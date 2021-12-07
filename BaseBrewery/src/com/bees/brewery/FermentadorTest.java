package com.bees.brewery;

import org.junit.Assert;
import org.junit.Test;

public class FermentadorTest {


    Malte malte;
    Fermentador fermentador = new Fermentador();

    @Test
    public void shouldBeFermentad() {
        malte = new Malte(Grao.ARROZ, 10);
        fermentador.executar(malte);
        Assert.assertTrue(malte.is_isFermented());
        Assert.assertFalse(malte.is_hasFerment());
    }
}
