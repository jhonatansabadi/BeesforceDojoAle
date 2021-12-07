package test;

import com.bees.brewery.Grao;
import com.bees.brewery.Malte;
import com.bees.brewery.Moinho;
import org.junit.Assert;
import org.junit.Test;

public class MoinhoTest {

    Moinho moinho = new Moinho();
    Malte malte;

    @Test
    public void verificaSeMalteFoiMoido() {
        malte = new Malte(Grao.AVEIA, 10);
        malte.set_isMilled(moinho.executar(malte));
        Assert.assertTrue(malte.get_isMilled());
    }

    @Test
    public void verificarQuantidadeMoidaEInicial() {
        malte = new Malte(Grao.ARROZ, 10);
        moinho.executar(malte);
        Assert.assertEquals(10, malte.get_quantidadeMoida());
        Assert.assertEquals(0, malte.get_Quantidade());
    }

}
