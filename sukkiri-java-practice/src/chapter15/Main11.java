package chapter15;

import java.time.*;
import java.time.format.*;

public class Main11 {
  public static void main(String[] args) throws Exception {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
    LocalDate ldatep = ldate.plusDays(1000);
    String str = ldatep.format(fmt);
    System.out.println("1000日後は" + str);
    LocalDate now = LocalDate.now();
    if (now.isAfter(ldatep)) {
      System.out.println("1000日後は過去日付です");
    }
  }
}
