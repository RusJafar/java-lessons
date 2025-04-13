package HomeWork12;

enum COUNTRIES {
    RUSSIA,
    BELORUSSIA
}

public class HanFactory {

    public static Han getHan(COUNTRIES  country) {
        switch (country) {
            case RUSSIA:
                return new RussianHan();
            case BELORUSSIA:
                return new BelorusHan();

            default:
                return new RussianHan();
        }
    }
}
