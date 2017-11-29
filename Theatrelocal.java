package ru.isbo1016.chumakov.kursovaya;

public class Theatrelocal {
    public static void main(String[] args) {
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

        SimpleGUI app = new SimpleGUI();
        app.setVisible(true);
    }
}
