package labznewM.labfive;


import java.io.IOException;

public class Main {

    public static final int RANDOM_DOWN_POINT = -10;
    public static final int RANDOM_UP_POINT = 10;
    public static final String DELIMITER = "  ";
    public static final String FILE_ADDRESS = "D:\\test.json";

    public static void main(String[] args) {


        MatrixManager matrixManager = new MatrixManager();
        WriteReadTxt writeReadTxt = new WriteReadTxt();
        Matrix matrix = matrixManager.createRandomMatrix(6, 6, RANDOM_DOWN_POINT, RANDOM_UP_POINT);

        matrixManager.printMatrix(matrix, DELIMITER);
        matrix.setMaxElement(matrixManager.searchMaxElement(matrix));
        matrix.setMinElement(matrixManager.searchMinElement(matrix));
        matrix.setSumElements(matrixManager.searchSumElements(matrix));
        matrixManager.printResults(matrix);/* */

        try {
            writeReadTxt.writeToFile(matrix,FILE_ADDRESS);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Matrix matrix1 = new Matrix();
        try {
           matrix1= writeReadTxt.readFromFile(FILE_ADDRESS);
        } catch (IOException e) {
            e.printStackTrace();
        }
        matrixManager.printMatrix(matrix1, DELIMITER);
        matrixManager.printResults(matrix1);

        try {
            int x = 1 / 0;
        }
        catch (Exception x){
                System.out.println("Na null");
            }



    }

}