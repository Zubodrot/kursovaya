package ru.isbo1016.chumakov.kursovaya;

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;

public class SimpleGUI extends  JFrame {
    private String poyasn1;
    private String poyasn2;
    private String poyasn3;

    private JButton[] [] seatez = new JButton[10][10];
    private JButton Drama = new JButton("Драма");
    private JButton Comedy = new JButton("Комедия");
    private JButton Tragedy = new JButton("Трагедия");
    private JButton Gou = new JButton("Горе от ума");
    private JButton  Kl = new JButton("Король лир");
    private JButton Gr = new JButton("Гроза");
    private JButton Ot = new JButton("Отелло");
    private JButton Rev = new JButton("Ревизор");
    private JButton Les = new JButton("Лес");
    private JButton Ned = new JButton("Недоросль");
    private JButton Vs = new JButton("Вишневый сад");
    private JButton Nd = new JButton("На дне");
    private JButton Gam = new JButton("Гамлет");
    private JButton Rd = new JButton("Ромео и Джульетта");
    private JButton Play1 = new JButton("null");
    private JButton Play2 = new JButton("null");
    private JPanel genres = new JPanel(new GridLayout(1,3));
    private JPanel piessas = new JPanel(new GridLayout(1,10));
    private JPanel plays = new JPanel(new GridLayout(1,2));
    private JTextField greet = new JTextField(20);
    private JPanel seates = new JPanel( new GridLayout(1,1));




    public SimpleGUI(){
        super("Программа для продажи билетов в театр");
        this.setSize(2000,2000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //////////////////////////////

        genres.add(Drama);
        genres.add(Comedy);
        genres.add(Tragedy);

        /////////////////

        Drama.setVisible(false);
        Comedy.setVisible(false);
        Tragedy.setVisible(false);

        //////////////////////////

        piessas.add(Gou);
        piessas.add(Kl);
        piessas.add(Gr);
        piessas.add(Ot);
        piessas.add(Rev);
        piessas.add(Les);
        piessas.add(Ned);
        piessas.add(Vs);
        piessas.add(Nd);
        piessas.add(Gam);
        piessas.add(Rd);

        /////////////////////////

        Gou.setVisible(false);
        Kl.setVisible(false);
        Gr.setVisible(false);
        Ot.setVisible(false);
        Rev.setVisible(false);
        Les.setVisible(false);
        Ned.setVisible(false);
        Vs.setVisible(false);
        Nd.setVisible(false);
        Gam.setVisible(false);
        Rd.setVisible(false);


        /////////////////////////

        plays.add(Play1);
        plays.add(Play2);

        ///////////////////////

        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)
                seatez[i][j] = new JButton("s");




        /////////////////////

        //seates.add(seatez);

        /////////

        Container     container = getContentPane();
        container. add(greet, BorderLayout.NORTH);
        container.add(genres, BorderLayout.WEST);
        container. add(piessas, BorderLayout.SOUTH);
        container.add(plays, BorderLayout.EAST);
        container.add(seates, BorderLayout.CENTER);


    }



}
