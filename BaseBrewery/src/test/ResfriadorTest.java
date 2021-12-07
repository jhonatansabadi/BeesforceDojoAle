package test;

import com.bees.brewery.Grao;
import com.bees.brewery.Malte;
import com.bees.brewery.Resfriador;
import org.junit.Assert;
import org.junit.Test;

public class ResfriadorTest {

    Malte malte;
    Resfriador resfriador = new Resfriador();

    @Test
    public void shouldMalteBeCold() {
        malte = new Malte(Grao.ARROZ, 10);
        resfriador.executar(malte);
        Assert.assertTrue(malte.get_isCold());
    }

}
