package jp.ac.uryukyu.ie.e225717;

public class CheckOdd {
    public static void main(String[] args) {
        int[] data = { 1, 2, 3 };

        for (int i : data) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("奇数");
            }
        }
    }
}
