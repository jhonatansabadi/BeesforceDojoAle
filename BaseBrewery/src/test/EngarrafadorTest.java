package test;

import com.bees.brewery.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EngarrafadorTest {

    Engarrafador engarrafador = new Engarrafador(TipoDeEnvase.LONG_NECK);
    Malte malte;

    @Test
    public void EncheQuantidadeCorretaGarrafas() {
        malte = new Malte(Grao.ARROZ, 10);
        engarrafador.executar(malte);
        List<BotleBeer> list = engarrafador.get_listDeGarrafas();

        Assert.assertEquals(list.size(),273);
    }

}
