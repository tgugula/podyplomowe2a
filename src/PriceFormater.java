public class PriceFormater {
    String curency = "zł";

    String formatPrice(int value) {
        return String.format("%d, 00 %s", value, curency);
    }

    String formatPrice(double value) {
        return String.format("%.2f %s", value, curency);
    }

    String formatPrice(String value) {
        return String.format("%.2f %s", Double.parseDouble(value), curency);
    }

    public static void main(String[] args) {
        PriceFormater pf = new PriceFormater();
        pf.curency = "PLN";
        System.out.println(pf.formatPrice(7));
        System.out.println(pf.formatPrice(12.56789));
        System.out.println(pf.formatPrice("3.78"));
    }
}
