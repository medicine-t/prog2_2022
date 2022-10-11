public class ex6 {
    public static void main(String[] args) {
        String target = "This is test.";
        String toLower = target.toLowerCase();
        System.out.println(toLower);

        var splitted = target.split(" ");
        for (String s : splitted) {
            System.out.println(s);
        }
    }
}
