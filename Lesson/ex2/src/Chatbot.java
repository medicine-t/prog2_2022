public class Chatbot {
    String name;

    Chatbot() {
        System.out.println("チャットボットの原型を作成します。");
    }

    Chatbot(String _name) {
        name = _name;
        System.out.printf("チャットボット名%sを作成します。", name);
    }
}
