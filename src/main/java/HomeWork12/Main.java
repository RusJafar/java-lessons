package HomeWork12;

public class Main {
    public static void main(String[] args) {
        Han han = HanFactory.getHan(COUNTRIES.RUSSIA);
        System.out.println(han.getDescription());
    }
}
