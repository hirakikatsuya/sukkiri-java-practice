package chapter15;

public class Main4 {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10000; i++) {
      sb.append("Java");
    }
    String s = sb.toString();
    System.out.println(s);
    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした");
  }
}
