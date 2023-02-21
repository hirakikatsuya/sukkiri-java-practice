package chapter17.practice;

public class Pra2 {
  public static void main(String[] args) {
    try {
      int i = Integer.parseInt("三");
      System.out.println(i);
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatExceptionをcatchしました");
    }
  }
}