package ru.isbo1016.chumakov.kursovaya;

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;
import java.math.*;

public class SimpleGUI extends  JFrame {
    JPanel[] pnl = new JPanel[182];


    private int summa = 0;
    private int gore;
    private int kol;
    private int groz;
    private int otel;
    private int reviz;
    private int l;
    private int nedo;
    private int vish;
    private int nadne;
    private int gamlet;
    private int romeo;
    private int utro;
    private int den;
    private int vecher;

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
    private JButton Play1 = new JButton("Утренний");
    private JButton Play2 = new JButton("Дневной");
    private JButton Play3 = new JButton("Вечерний");
    private JButton Summa = new JButton("Расчёт");
    private JButton Otmena = new JButton("В начало");
    private JButton rachet = new JButton("");
   /* private JPanel genres = new JPanel(new GridLayout(1,3));
    private JPanel piessas = new JPanel(new GridLayout(1,10));
    private JPanel plays = new JPanel(new GridLayout(1,2));
    //private JTextField greet = new JTextField(20);
    private JPanel seates = new JPanel( new GridLayout(1,1));*/





    public SimpleGUI(){
        super("Программа для продажи билетов в театр. Выберите, пожалуйста, жанр.                                      Чумаков Д. М. ИСБО-10-16");
        this.setSize(1800,1000);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(14,13));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            //int r = (int) (Math.random() * 255);
            //int b = (int) (Math.random() * 255);
            //int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            //pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }

        //////////////////////////////

       // greet.setText("Добро пожаловать! Выберите, пожалуйста,жанр.");
       // pnl[7].add(greet);

       ///////////////////////////////добавление кнопок жанров

        pnl[5].add(Drama);
        pnl[6].add(Comedy);
        pnl[7].add(Tragedy);

       /* /////////////////

        Drama.setVisible(false);
        Comedy.setVisible(false);
        Tragedy.setVisible(false);
        */
        //////////////////////////добавление кнопок пьесс

        pnl[14].add(Gou);
        pnl[15].add(Kl);
        pnl[16].add(Gr);
        pnl[17].add(Ot);
        pnl[18].add(Rev);
        pnl[19].add(Les);
        pnl[20].add(Ned);
        pnl[21].add(Vs);
        pnl[22].add(Nd);
        pnl[23].add(Gam);
        pnl[24].add(Rd);

        /////////////////////////скрытие пьесс до дальнейшего использования

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

        /////////////////////////// скрытие времени до дальнейшего использования

        Play1.setVisible(false);
        Play2.setVisible(false);
        Play3.setVisible(false);


        ////////////////////////// скрытие отмены до дальнейшего использования

        Otmena.setVisible(false);

        ///////////////////////// скрытия рассчета до дальнейшего использования

        rachet.setVisible(false);
        Summa.setVisible(false);

        /////////////////////// добавление кнопок времени

        pnl[31].add(Play1);
        pnl[32].add(Play2);
        pnl[33].add(Play3);

        //////////////////////// добавление кнопок рядов и их скрытие до дальнейшего использования
        int k=40;
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++) {
                seatez[i][j] = new JButton();
                seatez[i][j].setVisible(false);
                pnl[k].add(seatez[i][j]);
                k++;
                if ((k == 50)|| (k == 63)||(k == 76)||(k == 89)||(k == 102)||(k == 115)||(k == 128)||(k == 141)||(k == 154)){
                    k=k+3;
                }


            }

         /////////////////// добавление кнопок расчета

        pnl[175].add(Summa);
        pnl[175].add(rachet);

        /////////////////////// добавление кнопки отмены

        pnl[180].add(Otmena);

        /////////////////////

        //seates.add(seatez);

        /////////
        /*

        Container     container = getContentPane();
        container. add(greet, BorderLayout.NORTH);
        container.add(genres, BorderLayout.WEST);
        container. add(piessas, BorderLayout.SOUTH);
        container.add(plays, BorderLayout.EAST);
        container.add(seates, BorderLayout.CENTER);

        /////////////////////////////

        greet.setText("Добро пожаловать! Выберите, пожалуйста,жанр.");
        */



        //////////////////////////////// добавление обработчиков событий к жанрам

        ActionListener   actionListenerDrama = new ChooseDrama();
        ActionListener actionListenerComedy = new ChooseComedy();
        ActionListener actionListenerTragedy = new ChooseTragedy ();
        Drama.addActionListener(actionListenerDrama);
        Comedy.addActionListener(actionListenerComedy);
        Tragedy.addActionListener(actionListenerTragedy);

        ///////////////////////////////////////////// добавление обработчиков событий к пьессам

        ActionListener   actionListenerGou = new ChooseGou();
        ActionListener   actionListenerKl = new ChooseKl();
        ActionListener   actionListenerGr = new ChooseGr ();
        ActionListener   actionListenerOt = new ChooseOt();
        ActionListener   actionListenerRev = new ChooseRev();
        ActionListener   actionListenerLes = new ChooseLes();
        ActionListener   actionListenerNed = new ChooseNed();
        ActionListener   actionListenerVs = new ChooseVs();
        ActionListener   actionListenerNd = new ChooseNd();
        ActionListener   actionListenerGam = new ChooseGam();
        ActionListener   actionListenerRd = new ChooseRd();
        Gou.addActionListener(actionListenerGou);
        Kl.addActionListener(actionListenerKl);
        Gr.addActionListener(actionListenerGr);
        Ot.addActionListener(actionListenerOt);
        Rev.addActionListener(actionListenerRev);
        Les.addActionListener(actionListenerLes);
        Ned.addActionListener(actionListenerNed);
        Vs.addActionListener(actionListenerVs);
        Nd.addActionListener(actionListenerNd);
        Gam.addActionListener(actionListenerGam);
        Rd.addActionListener(actionListenerRd);

        ///////////////////////////////////////////// добавление обработчиков событий к времени

        ActionListener   actionListenerPlay1 = new ChoosePlay1();
        ActionListener   actionListenerPlay2 = new ChoosePlay2();
        ActionListener   actionListenerPlay3 = new ChoosePlay3();
        Play1.addActionListener(actionListenerPlay1);
        Play2.addActionListener(actionListenerPlay2);
        Play3.addActionListener(actionListenerPlay3);

        /////////////////////////////////////////////////// добавление обработчиков событий к отмене и расчету

        ActionListener   actionListenerSumma = new ChooseSumma();
        ActionListener   actionListenerOtmena = new ChooseOtmena();
        Summa.addActionListener(actionListenerSumma);
        Otmena.addActionListener(actionListenerOtmena);


        ///////////////////////////////////////////// добавление обработчиков событий к кнопкам мест
        ActionListener actionListenerSeatbutton = new  ChooseSeat();
        for (int i=0; i < 10; i++)
            for (int j = 1; j<10; j++){
                seatez[i][j].addActionListener(actionListenerSeatbutton);
            }

        ////////////////////////////////////////////



    }

    ////////////////////////////////////////////////собственно обработчики

    public class ChooseOtmena implements ActionListener{

        public void actionPerformed(ActionEvent e){
            Drama.setVisible(true);
            Comedy.setVisible(true);
            Tragedy.setVisible(true);
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
            Play1.setVisible(false);
            Play2.setVisible(false);
            Play3.setVisible(false);
            for(int i = 0; i < 10; i++)
                for(int j = 0; j < 10; j++){
                seatez[i][j].setVisible(false);
                }
            Summa.setVisible(false);
            rachet.setVisible(false);
            summa = 0;
        }

    }

    public class ChooseSumma implements ActionListener{

        public void actionPerformed(ActionEvent e) {
           // JOptionPane.showMessageDialog(JOptionPane.this,"Благодарим за покупку на сумму"+summa+"рублей! Будем рады видеть вас ещё!","Спасибо!");
        }
    }


    public class ChooseTragedy implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Drama.setVisible(false);
            Comedy.setVisible(false);
            Tragedy.setVisible(false);
            Rd.setVisible(true);
            Ot.setVisible(true);
            Otmena.setVisible(true);
        }
    }

    public class ChooseComedy implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Drama.setVisible(false);
            Comedy.setVisible(false);
            Tragedy.setVisible(false);
            Gou.setVisible(true);
            Rev.setVisible(true);
            Ned.setVisible(true);
            Otmena.setVisible(true);
        }
    }

    public class ChooseDrama implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Drama.setVisible(false);
            Comedy.setVisible(false);
            Tragedy.setVisible(false);
            Kl.setVisible(true);
            Gr.setVisible(true);
            Les.setVisible(true);
            Vs.setVisible(true);
            Nd.setVisible(true);
            Gam.setVisible(true);
            Otmena.setVisible(true);
        }
    }

    public class ChooseGou implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Rev.setVisible(false);
            Ned.setVisible(false);
            Gou.setVisible(false);
            gore=1;
            Play1.setVisible(true);
            Play2.setVisible(true);

        }
    }

    public class ChooseKl implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Kl.setVisible(false);
            Gr.setVisible(false);
            Ot.setVisible(false);
            Les.setVisible(false);
            Vs.setVisible(false);
            Nd.setVisible(false);
            Gam.setVisible(false);
            kol=1;
            Play1.setVisible(true);
            Play2.setVisible(true);
            Play3.setVisible(false);
        }
    }
    public class ChooseGr implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Kl.setVisible(false);
            Gr.setVisible(false);
            Ot.setVisible(false);
            Les.setVisible(false);
            Vs.setVisible(false);
            Nd.setVisible(false);
            Gam.setVisible(false);
            groz=1;
            Play1.setVisible(true);
            Play2.setVisible(false);
            Play3.setVisible(true);
        }
    }
    public class ChooseOt implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Rd.setVisible(false);
            Ot.setVisible(false);
            otel=1;
            Play1.setVisible(true);
            Play2.setVisible(false);
            Play3.setVisible(true);
        }
    }
    public class ChooseRev implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Rev.setVisible(false);
            Ned.setVisible(false);
            Gou.setVisible(false);
            reviz=1;
            Play1.setVisible(true);
            Play2.setVisible(false);
            Play3.setVisible(true);
        }
    }
    public class ChooseLes implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Kl.setVisible(false);
            Gr.setVisible(false);
            Ot.setVisible(false);
            Les.setVisible(false);
            Vs.setVisible(false);
            Nd.setVisible(false);
            Gam.setVisible(false);
            l=1;
            Play1.setVisible(true);
            Play2.setVisible(true);
            Play3.setVisible(false);
        }
    }
    public class ChooseNed implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Rev.setVisible(false);
            Ned.setVisible(false);
            Gou.setVisible(false);
            nedo=1;
            Play1.setVisible(true);
            Play2.setVisible(false);
            Play3.setVisible(true);
        }
    }
    public class ChooseVs implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Kl.setVisible(false);
            Gr.setVisible(false);
            Ot.setVisible(false);
            Les.setVisible(false);
            Vs.setVisible(false);
            Nd.setVisible(false);
            Gam.setVisible(false);
            vish=1;
            Play1.setVisible(false);
            Play2.setVisible(true);
            Play3.setVisible(true);
        }
    }
    public class ChooseNd implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Kl.setVisible(false);
            Gr.setVisible(false);
            Ot.setVisible(false);
            Les.setVisible(false);
            Vs.setVisible(false);
            Nd.setVisible(false);
            Gam.setVisible(false);
            nadne=1;
            Play1.setVisible(false);
            Play2.setVisible(true);
            Play3.setVisible(false);
        }
    }
    public class ChooseGam implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Kl.setVisible(false);
            Gr.setVisible(false);
            Ot.setVisible(false);
            Les.setVisible(false);
            Vs.setVisible(false);
            Nd.setVisible(false);
            Gam.setVisible(false);
            gamlet=1;
            Play1.setVisible(false);
            Play2.setVisible(true);
            Play3.setVisible(true);
        }
    }
    public class ChooseRd implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Rd.setVisible(false);
            Ot.setVisible(false);
            romeo=1;
            Play1.setVisible(false);
            Play2.setVisible(true);
            Play3.setVisible(true);
        }
    }

    public class ChoosePlay1 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
           utro = 1;
           Play1.setVisible(false);
           Play2.setVisible(false);
           Play3.setVisible(false);
           createPiessas();
        }

    }

    public class ChoosePlay2 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            den = 1;
            Play1.setVisible(false);
            Play2.setVisible(false);
            Play3.setVisible(false);
            createPiessas();
        }
    }

    public class ChoosePlay3 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            vecher = 1;
            Play1.setVisible(false);
            Play2.setVisible(false);
            Play3.setVisible(false);
            createPiessas();
        }
    }

    public class ChooseSeat implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Занято")){}
            else
                {
               // summa=summa+Integer.valueOf(e.);
                rachet.setText(String.valueOf(summa));
                //e.getSource().setBackground(Color.BLUE);
                }
        }
    }

    public class Piessa {
        private double price;
        private String time;
        private String name;
        private String genre;
        private String dayofweek;
        private boolean[][] seats;

        public Piessa(double price, String time, String name, String genre, String dayofweek, boolean[][] seats) {
            this.price = price;
            this.time = time;
            this.name = name;
            this.genre = genre;
            this.dayofweek = dayofweek;
            this.seats = seats;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getDayofweek() {
            return dayofweek;
        }

        public void setDayofweek(String dayofweek) {
            this.dayofweek = dayofweek;
        }

        public boolean[][] getSeats() {
            return seats;
        }

        public void setSeats(boolean[][] seats) {
            this.seats = seats;
        }



        public boolean[][] setRandomSeats(boolean[] [] seats){
            double smth;
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    smth = Math.random();
                    if ( smth >= 0.5){
                        smth = 1;
                    }
                    else
                    {
                        smth = 0;
                    }
                    if (smth == 1){
                        seats[i][j] = true;
                    }
                    else
                    {
                        seats[i][j] = false;
                    }

                }
            return seats;
        }


    }


    public void  createPiessas() {
        boolean[][] seats = new boolean[10][10];
        Piessa Gou1 = new Piessa(150, "Утро", "Горе от ума", "Комедия", "Понедельник", seats);
        Gou1.setRandomSeats(seats);
        Piessa Gou2 = new Piessa(300, "День", "Горе от ума", "Комедия", "Суббота", seats);
        Gou2.setRandomSeats(seats);
        Piessa Kl1 = new Piessa(150, "Утро", "Король лир", "Драма", "Вторник", seats);
        Kl1.setRandomSeats(seats);
        Piessa Kl2 = new Piessa(300, "День", "Король лир", "Драма", "Пятница", seats);
        Kl2.setRandomSeats(seats);
        Piessa Gr1 = new Piessa(150, "Утро", "Гроза", "Драма", "Среда", seats);
        Gr1.setRandomSeats(seats);
        Piessa Gr2 = new Piessa(450, "Вечер", "Гроза", "Драма", "Пятница", seats);
        Gr2.setRandomSeats(seats);
        Piessa Ot1 = new Piessa(150, "Утро", "Отелло", "Трагедия", "Четверг", seats);
        Ot1.setRandomSeats(seats);
        Piessa Ot2 = new Piessa(450, "Вечер", "Горе от ума", "Трагедия", "Воскресение", seats);
        Ot2.setRandomSeats(seats);
        Piessa Rev1 = new Piessa(150, "Утро", "Ревизор", "Комедия", "Среда", seats);
        Rev1.setRandomSeats(seats);
        Piessa Rev2 = new Piessa(450, "Утро", "Ревизор", "Комедия", "Пятница", seats);
        Rev2.setRandomSeats(seats);
        Piessa Les1 = new Piessa(150, "Утро", "Лес", "Драма", "Понедельник", seats);
        Les1.setRandomSeats(seats);
        Piessa Les2 = new Piessa(300, "День", "Лес", "Драма", "Суббота", seats);
        Les2.setRandomSeats(seats);
        Piessa Ned1 = new Piessa(150, "Утро", "Недоросль", "Комедия", "Вторник", seats);
        Ned1.setRandomSeats(seats);
        Piessa Ned2 = new Piessa(450, "Вечер", "Недоросль", "Комедия", "Воскресение", seats);
        Ned2.setRandomSeats(seats);
        Piessa Vs1 = new Piessa(300, "День", "Вишнёвый сад", "Драма", "Понедельник", seats);
        Vs1.setRandomSeats(seats);
        Piessa Vs2 = new Piessa(450, "Вечер", "Вишнёвый сад", "Драма", "Четверг", seats);
        Vs2.setRandomSeats(seats);
        Piessa Nd1 = new Piessa(150, "Утро", "На дне", "Драма", "Воскресение", seats);
        Nd1.setRandomSeats(seats);
        Piessa Gam1 = new Piessa(300, "День", "Гамлет", "Трагедия", "Среда", seats);
        Gam1.setRandomSeats(seats);
        Piessa Gam2 = new Piessa(450, "Вечер", "Гамлет", "Трагедия", "Четверг", seats);
        Gam2.setRandomSeats(seats);
        Piessa Rd1 = new Piessa(300, "День", "Ромео и Джульетта", "Трагедия", "Вторник", seats);
        Rd1.setRandomSeats(seats);
        Piessa Rd2 = new Piessa(450, "Вечер", "Ромео и Джульетта", "Трагедия", "Суббота", seats);
        Rd2.setRandomSeats(seats);



        if ((gore ==1) & (utro ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Gou1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("150");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((gore ==1) & (utro !=1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Gou2.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("300");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((kol ==1) & (utro ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Kl1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("150");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((kol ==1) & (utro !=1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Kl2.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("300");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((groz ==1) & (utro ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Gr1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("150");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((groz ==1) & (utro !=1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Gr2.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("450");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((otel ==1) & (utro ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Ot1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("150");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((otel ==1) & (utro !=1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Ot2.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("450");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((reviz ==1) & (utro ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Rev1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("150");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((reviz ==1) & (utro !=1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Rev2.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("450");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((l ==1) & (utro ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Les1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("150");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((l ==1) & (utro !=1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Les2.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("300");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((nedo ==1) & (utro ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Ned1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("150");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((nedo ==1) & (utro ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Ned2.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("450");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((vish ==1) & (den ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Vs1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("300");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }if ((vish ==1) & (den !=1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Vs2.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("450");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((nadne ==1) & (den ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Nd1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("300");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((gamlet ==1) & (den ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Gam1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("300");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((gamlet ==1) & (den !=1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Gam2.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("450");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((romeo ==1) & (den ==1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Rd1.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("300");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        if ((romeo ==1) & (den !=1)){
            for(int i=  0; i < 10; i++)
                for(int j = 1; j < 10; j++){
                    seatez[i][j].setVisible(true);
                    if (Rd2.seats[i][j] == true){
                        seatez[i][j].setText("Занято");
                        seatez[i][j].setBackground(Color.RED);
                    }
                    else
                    {
                        seatez[i][j].setText("450");
                        seatez[i][j].setBackground(Color.GREEN);
                    }
                }
        }

        Summa.setVisible(true);
        rachet.setVisible(true);

    }

}
