package lesson13;

public class Matrix implements IMatrix {

    private double[][] numbers;

    public Matrix() {
        numbers = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    public Matrix(int rowsCount, int doubleCount) {
        numbers = new double[rowsCount][doubleCount];
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[1].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (!isValuesForRowAndColumnValid(rowIndex, colIndex)) {
            return -1;
        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (!isValuesForRowAndColumnValid(rowIndex, colIndex)) {
            throw new IllegalArgumentException();
        }

        numbers[rowIndex][colIndex] = value;
    }


    /**
     * Возвращает сумму текущей матрицы и второго аргумента. <br/>
     * <b><i>(После выполнения функции текущая матрица не должна быть изменена! Результат операции - новый объект матрицы) </i></b>
     *
     * @param otherMatrix второй аргумент (матрица)
     * @return сумма матриц <b><i>(новый объект матрицы)</i></b>
     * @throws IllegalArgumentException если текущая матрица и второй аргумент имеют несовместимое количество строк и (или) столбцов
     * @throws NullPointerException     если второй аргумент null
     */
    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (!isMatrixSame(otherMatrix)) {
            throw new IllegalArgumentException();
        }
        Matrix result = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (!isMatrixSame(otherMatrix)) {
            throw new IllegalArgumentException();
        }
        Matrix result = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (!isRowEqualsColumn(otherMatrix)) {
            throw new IllegalArgumentException();
        }

        IMatrix result = new Matrix(getRows(), getColumns());

        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, 0);
                for (int k = 0; k < otherMatrix.getColumns(); k++) {
                    double value = getValueAt(i, k) * otherMatrix.getValueAt(k, j);
                    result.setValueAt(i, j, value);
                }

            }
        }

        return result;
    }

    @Override
    public IMatrix mul(double value) {
        IMatrix result = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, getValueAt(i,j) * value);
            }
        }

        return result;
    }

    @Override
    public IMatrix transpose() {
        if (getRows() != getColumns()) {
            System.out.println("Матрица не может быть транспорентной");
            throw new IllegalArgumentException();
        }
        IMatrix result = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                double value = getValueAt(i, j);
                result.setValueAt(j, i, value);

            }
        }
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                setValueAt(j, i, value);

            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(getValueAt(i, j) + " | ");
            }
            System.out.println();
        }
    }

    private boolean isValuesForRowAndColumnValid(int rowIndex, int colIndex) {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            return false;
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            return false;
        }

        return true;
    }

    private boolean isMatrixSame(IMatrix otherMatrix) {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не совпадают количество строк");
            return false;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не совпадают количество столбцов");
            return false;
        }
        return true;
    }

    private boolean isRowEqualsColumn(IMatrix otherMatrix) {
        if (getColumns() != otherMatrix.getRows()) {
            System.out.println("Количество строк строк в переданной для умножения не соотвтствует количеству колонок в текущей");
            return false;
        }
        return true;
    }
}
