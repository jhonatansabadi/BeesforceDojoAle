package test;


import com.bees.brewery.Filtro;
import com.bees.brewery.Grao;
import com.bees.brewery.Malte;
import com.bees.brewery.Misturador;
import org.junit.Assert;
import org.junit.Test;

public class FiltroTest {

    Filtro filtro = new Filtro();
    Malte malte;

    @Test
    public void ShouldBeMusted(){
        malte = new Malte(Grao.AVEIA, 10);
        filtro.executar(malte);
        Assert.assertEquals(malte.get_isFiltered(),true);
    }
}
