import java.awt.*;

public class Passing {

    public static void main(String[] args) {

        int i = 10;
        System.out.println("Przed zmianą " + i);
        changeIt(i);
        System.out.println("Po zmianie " + i);

        System.out.println("---------------------------------------");

        Point p = new Point(1,1);                       // Point - obiekt
        System.out.println("Przed zmianą " + p);
        changeIt(p);
        System.out.println("Po zmianie " + p);

    }

    static void changeIt(int i) {
        System.out.println("Zmieniam i...");
        i++;
        System.out.println("Lokalne i (kopia!) " + i);
        //koniec zasięgu zmiennej lokalnej i
    }

    static void changeIt(Point p)   {                               //metoda
       //p = new Point(4,4);                                         // to jest NOWA referencja, zmiany na NOWEJ, stara zostaje!
        System.out.println("Zmieniam to, na co wskazuje p ");
        p.x++;
        p.y++;


    }

}