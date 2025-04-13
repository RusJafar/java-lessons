package lesson7;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone() {
        this.number = "Some number";
        this.model = "Some modal";
        this.weight = 0.9;
    }

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public String getPhoneInfo() {
        return String.format("Model:%s\n Phone number: %s\n Device weight: %s", model, number, weight);
    }

}
