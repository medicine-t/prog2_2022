public class Main {
    public static void main(String[] args) {
        System.out.println("main method runs");
        Chatbot bot1 = new Chatbot();
        Chatbot bot2 = new Chatbot("bot2");
        bot1.greeting();
        bot2.greeting();
        bot2.name = "bot2 gen2";
        bot2.greeting();
    }
}
