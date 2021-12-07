package test;

import com.bees.brewery.*;
import org.junit.Test;
public class EngarrafadorTest {

    Engarrafador engarrafador = new Engarrafador(TipoDeEnvase.LONG_NECK);
    Malte malte;

    @Test
    public void EncheQuantidadeCorretaGarrafas() {
        malte = new Malte(Grao.ARROZ, 10);
        engarrafador.executar(malte);
    }

}
