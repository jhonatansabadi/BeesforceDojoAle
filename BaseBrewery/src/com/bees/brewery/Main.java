package com.bees.brewery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        Malte malte = new Malte(Grao.AVEIA, 2);
        Moinho moinho = new Moinho();

        //moer
        malte.set_isMilled(moinho.executar(malte));

        //mostura


        //filtragem

        //fervura

        //separação do trub

        //resfriamento
        System.out.println(malte.get_isMilled());

    }
}

