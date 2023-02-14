package chapter14.practice;

public class Main {
  public static void main(String[] args) {
    Bank a = new Bank();
    a.accountNumber = "1234";
    a.balance = 10000;
    Bank b = new Bank();
    b.accountNumber = "1234";
    b.balance = 2233;
    System.out.println(a);
    System.out.println(a.equals(b));
  }
}
