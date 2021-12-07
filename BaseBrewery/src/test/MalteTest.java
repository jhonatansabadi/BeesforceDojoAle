package test;

import com.bees.brewery.Grao;
import com.bees.brewery.Malte;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MalteTest {

    Malte malte;

    @Test
    public void verificarSeGraoEstaSendoRetornado() {
        malte =  new Malte(Grao.AVEIA, 10);
        Assert.assertEquals(malte.get_Grao(), Grao.AVEIA);
    }

    @Test
    public void verificarSeGraoEstaSendoRetornadoErrado() {
        malte =  new Malte(Grao.AVEIA, 5 );
        Assert.assertNotEquals(malte.get_Grao(), Grao.ARROZ);
    }

    @Test
    public void moerGraoEverificarQuantidadeFinal() {

    }

}
