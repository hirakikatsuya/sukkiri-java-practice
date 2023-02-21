package chapter17;

import java.io.*;

public class Main2 {
  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("data.txt");
      fw.write("hello");
    } catch (Exception e) {
      System.out.println("エラー:" + e.getMessage());
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          ;
        }
      }
    }
    // 自動でcloseの後付処理を行ってくれる書き方
    try (FileWriter fw2 = new FileWriter("data.txt");) {
      fw2.write("hello!");
    } catch (Exception e) {
      System.out.println("何らかのエラーが発生しました");
    }
  }
}
