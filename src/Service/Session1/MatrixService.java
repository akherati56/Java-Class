package Service.Session1;

public class MatrixService {

    private int rows;
    private int cols;

    public MatrixService(int size) {
        rows = size;
        cols = size;
    }

    public int[][] getMatrix() {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }



}
