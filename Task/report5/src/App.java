public class App {
    public static void main(String[] args) throws Exception {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // 条件2
            System.err.println("NullPointerexceptionが発生しました");
            // 条件3
            System.err.println(e.getMessage());
        }

    }
}
