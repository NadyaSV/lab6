package transport;

import static main.Main.getScanner;

public abstract class PublicTransport implements TransportFacility {
    protected int numberOfTransport;
    protected int numOfSits;
    protected String color;
    protected String way;

    public PublicTransport(int numberOfTransport, int numOfSits) {
        this.numberOfTransport = numberOfTransport;
        this.numOfSits = numOfSits;
        createProduct ();
    }

    @Override
    public void createProduct() {
        System.out.println ("Напишите цвет трамвая: ");
        this.color = getScanner().nextLine ();
        System.out.println ("Напишите маршрут трамвая: ");
        this.way = getScanner().nextLine ();
    }

    public abstract void use(String object);
}