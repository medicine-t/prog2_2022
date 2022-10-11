package jp.ac.uryukyu.ie.e225717;

public class Ex1_2 {

    public static int calcSumOfInteger(int[] data) {
        int ret = 0;
        for (int i : data)
            ret += i;
        return ret;
    }

    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 5 };
        System.out.println(calcSumOfInteger(data));
        /*
         * > 15
         */
    }
}
