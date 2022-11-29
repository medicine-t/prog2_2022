public class App {
    public static void main(String[] args) throws Exception {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // 条件2
            System.out.println("NullPointerexceptionが発生しました");
            // 条件3
            System.out.println(e.getMessage());
        }

    }
}
