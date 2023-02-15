package chapter15;

public class Main5 {
  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String[] words = s.split("[,:]");
    for (String w : words) {
      System.out.print(w + "->");
    }
    String x = s.replaceAll("[beh]", "X");
    System.out.println(x);
    System.out.printf("製品番号%s-%02d", "SJV", 3);
  }
}
