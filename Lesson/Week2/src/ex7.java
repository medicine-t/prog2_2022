import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("何かごようですか？"); // 入力を促す文を出力しているだけ。
            input = in.nextLine(); // inputにユーザ入力を保存する。
            if (input.equals("bye.")) {
                System.out.println("ご利用いただきありがとうございました");
                break;
            } else if (input.contains("クーラー")) {
                System.out.println("クーラーをONにしました");
            } else if (input.contains("exit")) {
                break;
            } else {
                System.out.println(input + "とは何ですか？");
            }
        }
        in.close(); // スキャナを閉じる。
    }
}
