/*
package Test;

import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Box(Point topLeft, Point bottomRight) {
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }

    Box(Point topLeft, Point bottomRight) {
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);

        void printBox () {
            System.out.println("Box: <" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ">");
        }

        public static void main (String[]args){
            Box box;
            System.out.println("Tworzenie Box ze współrzędnymi (25,25) i (50,50):");
            box = new Box(25, 25, 50, 50);
            box.printBox();

            System.out.println("Tworzenie Box z punktami (10,10) i (20,20):");
            Point p1 = new Point(10, 10);
            Point p2 = new Point(20, 20);
            box = new Box(p1, p2);
            box.printBox();

            System.out.println("Tworzenie Box z punktem (2,5), szerokością 30 i wysokością 34 :");
            Point p3 = new Point(2,5);
                 box = new Box (p3, 30, 34);
            box.printBox();
        }
    }

}
*/
