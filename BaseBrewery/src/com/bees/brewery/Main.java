package com.bees.brewery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        Malte malte = new Malte(Grao.AVEIA, 2);
        Moinho moinho = new Moinho();
        Misturador misturador = new Misturador();
        Filtro filtro = new Filtro();
        Aquecedor aquecedor = new Aquecedor();
        Resfriador resfriador = new Resfriador();
        Fermentador fermentador = new Fermentador();
        Engarrafador longNeck = new Engarrafador(TipoDeEnvase.LONG_NECK);

        malte.set_isMilled(moinho.executar(malte));

        misturador.executar(malte);

        filtro.executar(malte);

        aquecedor.executar(malte);

        resfriador.executar(malte);

        fermentador.executar(malte);

        longNeck.executar(malte);

        System.out.println(("Foram criadas: " + longNeck.get_listDeGarrafas().size()));

    }
}

