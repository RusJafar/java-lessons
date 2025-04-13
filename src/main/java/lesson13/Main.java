package lesson13;

public class Main {
    public static void main(String[] args) {
        double[][] numbersForMatrixA = {
                {2, 3, 4, 5},
                {1, 3, 4, 6},
                {1, 3, 4, 6},
                {1, 3, 4, 6},
        };
        double[][] numbersForMatrixB = {
                {3, 6, 2, 3},
                {1, 3, 4, 6},
                {4, 5, 6, 7},
                {7, 6, 4, 3}
        };

        Matrix a = new Matrix(numbersForMatrixA);
        Matrix b = new Matrix(numbersForMatrixB);

//        IMatrix c = a.add(b);
//        IMatrix c = a.sub(b);
//        IMatrix c = a.mul(b);
//        IMatrix c = a.transpose();
        a.fillMatrix(3);
        a.printToConsole();
    }
}
