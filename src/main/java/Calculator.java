

public class Calculator {
    public static void main(String[] args) {
        int lengthOofTable = 10;
        int widthOfTable = 5;
        int lengthOfRoom = 30;
        int widthOfRoom = 20;
        int tableArea = lengthOofTable * widthOfTable;
        int roomArea = lengthOfRoom * widthOfRoom;
        System.out.println(String.format("res %s", roomArea / tableArea ));
    }
}