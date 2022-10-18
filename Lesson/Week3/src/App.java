import jp.ac.uryukyu.ie.e225717.library.*;

public class App {
    public static void main(String[] args) {
        // 貸し出し図書の準備
        RentalBook book1 = new RentalBook("何故ルートビアは美味いのか", 123);
        System.out.println(book1.title);
        book1.printSummary();

        // 顧客の準備
        Member teacher = new Member(945734, "naltoma");
        System.out.println(teacher.getName());

        // 貸出の例
        RentalLog log = new RentalLog(teacher, book1);
        log.getRentalEndPlan();
    }
}
