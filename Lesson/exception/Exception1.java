import java.io.FileWriter;
import java.io.IOException;

public class Exception1 {
	public static void main(String[] args) {
		// try-catchなしのコード。
		try {
			FileWriter fw = new FileWriter("output.txt");
			String[] results = { "ほげ", "ふが" };
			for (String temp : results) {
				fw.write(temp);
			}
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
