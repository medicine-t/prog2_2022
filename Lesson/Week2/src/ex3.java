public class ex3 {
    public static void main(String[] args) {
        int a = 1;
        double b = a / 2;
        System.out.println(b);
        /* bの値はintでのa / 2を行ったあとにdoubleにキャストされたものだと考えられる */
        b = a / 2.;
        System.out.println(b);
    }
}
