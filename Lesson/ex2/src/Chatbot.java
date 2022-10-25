public class Chatbot {
    String name;

    Chatbot() {
        System.out.println("チャットボットの原型を作成します。");
    }

    Chatbot(String _name) {
        name = _name;
        System.out.printf("チャットボット名%sを作成します。\n", name);
    }

    void greeting() {
        System.out.printf("はじめまして%sです、よろしくおねがいします\n", name);
    }
}
