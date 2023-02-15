package chapter15.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pra3 {
  public static void main(String[] args) {
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int day = c.get(Calendar.DAY_OF_MONTH);
    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);
    Date d = c.getTime();
    System.out.println(f.format(d));
  }
}
