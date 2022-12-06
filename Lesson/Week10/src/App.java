import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<String> colors = new HashSet<String>();
        colors.add("赤");
        colors.add("青");
        colors.add("黃");
        System.out.println(colors.size());
        for (String e : colors) {
            System.out.println(e);
        }
    }
}
