package lesson2;

public class TriangleTyper {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        int c = 5;

        if(a == b && b == c && c == a) {
            System.out.println("Равнобедренный");
        } else if(a != b && b != c && c != a) {
            System.out.println("Разносторонний");
        } else if(a == b || b == c || c == a ) {
            System.out.println("Разносторонний");
        }
    }

}
