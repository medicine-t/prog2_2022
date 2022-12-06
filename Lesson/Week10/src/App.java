import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> names = new ArrayList<>();
        names.add("湊");
        names.add("朝香");
        names.add("菅原");
        var it = names.iterator();
        while (it.hasNext()) {
            var e = it.next();
            System.out.println(e);
        }
    }
}
