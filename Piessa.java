package ru.isbo1016.chumakov.kursovaya;

import java.math.*;

public class Piessa {
    protected double price;
    protected String time;
    protected String name;
    protected String genre;
    protected String dayofweek;
    protected boolean[][] seats;

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
