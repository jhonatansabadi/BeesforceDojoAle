package test;

import com.bees.brewery.Grao;
import com.bees.brewery.Malte;
import com.bees.brewery.Misturador;
import org.junit.Assert;
import org.junit.Test;


public class MisturadorTest {
    Misturador misturador = new Misturador();
    Malte malte;

    @Test
    public void ShouldBeMusted(){
        malte = new Malte(Grao.AVEIA, 10);
        misturador.executar(malte);
        Assert.assertEquals(malte.get_isMusted(),true);
    }
}
