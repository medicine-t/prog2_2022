package jp.ac.uryukyu.ie.e225717;

public class Ex1_3 {
    public static void main(String[] arg) {
        double inf = Double.POSITIVE_INFINITY;
        double result = inf - inf;
        System.out.println(result);
        // > NaN
    }
}
