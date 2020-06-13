package transport;

import java.util.ArrayList;

public class Tram extends PublicTransport {
    private ArrayList<String> FIO = new ArrayList<String> ();

    public Tram(int numberOfTransport, int numOfSits) {
        super (numberOfTransport, numOfSits);
    }

    @Override
    public void use(String object) {
        draw (object);
    }

    private void draw(String art) {
        FIO.add (art);
    }

    @Override
    public String toString() {
        return "Трамвай {" +
                "\n Имя водителя = " + FIO +
                ",\n Номер трамвая = " + numberOfTransport +
                ",\n Количество мест = " + numOfSits + " мест" +
                ",\n Цвет трамвая = " + color +
                ",\n Маршрут = " + way +
                "\n}";
    }
}
