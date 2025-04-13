package lesson7;

public class Main {
    public static void main(String[] args) {
        Phone noNamePhone = new Phone();
        Phone nokia = new Phone("Nokia", "3310", 32);
        Phone motorola = new Phone("Motorola", "S350");

        System.out.println(noNamePhone.getPhoneInfo());
        System.out.println(nokia.getPhoneInfo());
        System.out.println(motorola.getPhoneInfo());

        System.out.println("");
        Person nikita = new Person("Nikita", 32);
        Person someDude = new Person();

        nikita.move();
        nikita.talk();

        someDude.move();
        someDude.talk();
    }
}
