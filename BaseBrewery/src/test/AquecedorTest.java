package test;

import com.bees.brewery.Aquecedor;
import com.bees.brewery.Grao;
import com.bees.brewery.Malte;
import org.junit.Assert;
import org.junit.Test;

public class AquecedorTest {

    Aquecedor aquecedor = new Aquecedor();
    Malte malte;

    @Test
    public void showMalteBeWarm() {
        malte = new Malte(Grao.ARROZ, 10);
        aquecedor.executar(malte);
        Assert.assertTrue(malte.get_isWarm());
    }

}
