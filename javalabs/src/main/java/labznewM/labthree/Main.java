package labznewM.labthree;

public class Main {

    public static final int randomDownPoint = -10;
    public static final int randomUpPoint = 10;
    public static final String delimiter = "  ";

    public static void main(String[] args) {

        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = matrixManager.createRandomMatrix(6, 6,randomDownPoint, randomUpPoint);

        matrixManager.printMatrix(matrix, delimiter);
        matrix.setMaxElement(matrixManager.searchMaxElement(matrix));
        matrix.setMinElement(matrixManager.searchMinElement(matrix));
        matrix.setSumElements(matrixManager.searchSumElements(matrix));
        matrixManager.printResults(matrix);

    }

}