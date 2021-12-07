package test;

import com.bees.brewery.Fermentador;
import com.bees.brewery.Grao;
import com.bees.brewery.Malte;
import org.junit.Assert;
import org.junit.Test;

public class FermentadorTest {

    Fermentador fermentador = new Fermentador();
    Malte malte;

    @Test
    public void shouldFermentMalte() {
        malte = new Malte(Grao.AVEIA, 10);
        fermentador.executar(malte);
        Assert.assertTrue(malte.is_isFermented());
        Assert.assertFalse(malte.is_hasFerment());
    }
}
