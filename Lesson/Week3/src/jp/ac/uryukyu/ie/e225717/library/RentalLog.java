package jp.ac.uryukyu.ie.e225717.library;

import java.util.Calendar;

public class RentalLog {
    Member member;
    RentalBook book;
    Calendar rentalBegin;
    Calendar rentalEndPlan;
    boolean returned;

    public RentalLog(Member _member, RentalBook _book) {
        this.member = _member;
        this.book = _book;
        this.rentalBegin = Calendar.getInstance();
        this.rentalEndPlan = Calendar.getInstance();
        this.rentalEndPlan.add(Calendar.DATE, 7); // 1週間後
        this.returned = false;
    }

    public void getRentalEndPlan() {
        int year = this.rentalEndPlan.get(Calendar.YEAR);

        // 月については、1月を0番目と数えているので+1して利用。
        int month = this.rentalEndPlan.get(Calendar.MONTH) + 1;
        int date = this.rentalEndPlan.get(Calendar.DATE);
        System.out.printf("%d年%d月%d日までに返却ください。\n", year, month, date);
    }
}