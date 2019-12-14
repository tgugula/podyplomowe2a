public class Vars2 {
    int i; //zmienna egzeplarza (pole klasy)
    static int j =2; //zmienna klasowa (pole statyczne)




    public static void main(String[] args) {
        int i =77;
        Vars2 v = new Vars2();
        v.i = 9;

        System.out.println("Wyświetlamy zmienną egzeplarza dla v: " + v.i);
        Vars2 vv = new Vars2();
        vv.i = 5;
        System.out.println("Wyświetlamy zmienną egzeplarza dla vv: " + vv.i);
        System.out.println("Wyświetlamy zmienną klasową statyczną): " + j);
        }
    public int change() {
        int k = 7;
        int g = 6;
        return i + (k + j);



};
};
