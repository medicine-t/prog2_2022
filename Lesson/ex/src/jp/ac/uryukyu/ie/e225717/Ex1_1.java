package jp.ac.uryukyu.ie.e225717;

public class Ex1_1 {
    public static boolean calcLogicalAnd(boolean arg1, boolean arg2) {
        return arg1 || arg2;
    }

    public static void main(String[] args) {
        boolean result = calcLogicalAnd(true, false);
        System.out.println(result);
    }
}