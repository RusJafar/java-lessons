public class StudyTask1 {
    public static void main(String[] args) {
        int balance = 1000;
        double snikersPrice = 35;
        double candyPrice = 3.5;

        double changeAfterSnikersPayment = balance % snikersPrice;
        double snikersCount = (balance - changeAfterSnikersPayment) / snikersPrice;
        double changeAfterCandyPayment = changeAfterSnikersPayment % candyPrice;
        double candyCount = (changeAfterSnikersPayment - changeAfterCandyPayment) / candyPrice;


        System.out.println("Купим сникерсов: " + snikersCount);
        System.out.println("Купим конфет: " + candyCount);
        System.out.println("Останется сдача: " + changeAfterCandyPayment);
    }
}
