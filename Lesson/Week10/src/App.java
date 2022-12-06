import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("京都", 255);
        prefs.put("東京", 1261);
        prefs.put("熊本", 181);
        System.out.println(prefs.get("東京"));
        System.out.println(prefs.size());
        prefs.remove("京都");
        System.out.println(prefs.size());
        prefs.put("熊本", 182);
        System.out.println(prefs.get("熊本"));

    }
}
