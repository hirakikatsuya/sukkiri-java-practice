package chapter17;

import java.io.*;

public class Main1 {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("data.txt");
      fw.write("hello");
      fw.close();
    } catch (IOException e) {
      System.out.println("書き込みが失敗");
    }catch (NullPointerException e) {
      System.out.println("読み込みが失敗");
    }catch(Exception e){
      System.out.println("エラー:"+e.getMessage());
    }
  }
}
