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

        //moer
        malte.set_isMilled(moinho.executar(malte));

        //mostura

        misturador.executar(malte);

        //filtragem

        filtro.executar(malte);

        //armazenagem

        //fervura e resfriamento

        //resfriamento
        System.out.println(malte.get_isMilled());

    }
}

