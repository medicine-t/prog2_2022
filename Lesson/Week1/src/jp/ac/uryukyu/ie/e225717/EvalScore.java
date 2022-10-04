package jp.ac.uryukyu.ie.e225717;

public class EvalScore {
    public static char eval(int score) {
        char result = 'F';
        if (score >= 90)
            result -= 5;
        else if (score >= 80)
            result -= 4;
        else if (score >= 70)
            result -= 3;
        else if (score >= 60)
            result -= 2;
        return result;
    }

    public static void main(String[] args) {
        int[] scores = { 100, 70, 50 };
        int i;
        char answer;
        for (i = 0; i < scores.length; i++) {
            answer = eval(scores[i]);
            System.out.println(scores[i] + " -> " + answer);
        }
    }
}
