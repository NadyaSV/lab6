package main;

import transport.PublicTransport;
import transport.Tram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PublicTransport book = new Tram(1425, 20);
        System.out.println (book);

        System.out.println ("Имя водителя: ");

        String objectToDraw = getScanner().nextLine ();
        book.use(objectToDraw);

        System.out.println (book);
    }

    public static Scanner getScanner() {
        return new Scanner (System.in);
    }
}