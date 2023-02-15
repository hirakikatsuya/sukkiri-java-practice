package chapter15.practice;

public class Pra2 {
  public String concatPath(String folder, String file) {
    if (!folder.endsWith("¥¥")) {
      folder += "¥¥";
    }
    return folder + file;
  }
}
