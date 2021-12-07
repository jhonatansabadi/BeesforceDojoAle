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

        //moer
        malte.set_isMilled(moinho.executar(malte));

        //mostura

        misturador.executar(malte);

        //filtragem

        filtro.executar(malte);

        //fervura
        aquecedor.executar(malte);

        //resfriamento
        resfriador.executar(malte);

        //fermentação
        fermentador.executar(malte);

        //armazenamento


        //Envase

        //engarrafador



        System.out.println(malte.toString());

    }
}

