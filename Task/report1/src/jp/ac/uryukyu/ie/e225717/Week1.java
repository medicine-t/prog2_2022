package jp.ac.uryukyu.ie.e225717;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Week1 {
    public static void Main(String[] args) {
        System.out.println("Hello World");
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5.1f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrix(RealMatrix matrix) {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.printf("%5.1f", matrix.getEntry(i, j));
            }
            System.out.println();
        }
    }

    public static RealMatrix computeAddMatrix(RealMatrix matrix_1, RealMatrix matrix_2) {
        RealMatrix ret = MatrixUtils
                .createRealMatrix(new double[matrix_1.getRowDimension()][matrix_1.getColumnDimension()]);

        if (matrix_1.getRowDimension() != matrix_2.getRowDimension()) {
            System.err.println("行数がおかしい");

        } else if (matrix_1.getColumnDimension() != matrix_2.getColumnDimension()) {
            System.err.println("列数がおかしい");
        } else {
            ret = matrix_1.add(matrix_2);
        }
        return ret;
    }

    public static double[][] computeAddMatrix(double[][] matrix_1, double[][] matrix_2) {
        double[][] ret = new double[matrix_1.length][matrix_1[0].length];

        if (matrix_1.length != matrix_2.length) {
            System.err.println("行数がおかしい");

        } else if (matrix_1[0].length != matrix_2[0].length) {
            System.err.println("列数がおかしい");
        } else {
            for (int i = 0; i < matrix_1.length; i++) {
                for (int j = 0; j < matrix_1[i].length; j++) {
                    ret[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        double[][] matrix22_1 = { { 0., 2. }, { 4., 6. } };
        double[][] matrix22_2 = { { 1., 2. }, { 3., 4. } };
        double[][] matrix23_1 = { { 0., 1. }, { 2., 3. }, { 4., 10. } };
        double[][] matrix23_2 = { { 6., 7. }, { 8., 9. }, { 10., 11. } };

        System.out.println("\n# printMatrixの動作確認");
        printMatrix(matrix22_1);

        // 以下は computeAddMatrix メソッドを実装したあとで実行する内容。
        // 最初の動作確認時にはコメントアウトしておくと良い。
        System.out.println("\n# matrix22_1 + matrix22_2");
        var level2_1 = computeAddMatrix(matrix22_1, matrix22_2);
        printMatrix(level2_1);

        System.out.println("\n# matrix23_1 + matrix23_2");
        var level2_2 = computeAddMatrix(matrix23_1, matrix23_2);
        printMatrix(level2_2);

        System.out.println("\n# 行列サイズが異る場合");
        var level2_3 = computeAddMatrix(matrix22_1, matrix23_1);

        RealMatrix mat22_1 = MatrixUtils.createRealMatrix(matrix22_1);
        RealMatrix mat22_2 = MatrixUtils.createRealMatrix(matrix22_2);
        System.out.println("\n# RealMatrix 22_1 + 22_2");
        printMatrix(mat22_1.add(mat22_2));
    }
}
