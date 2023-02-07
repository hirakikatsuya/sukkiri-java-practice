package ensyu;

public class Ensyu33 {

  public static void main(String[]args){
    int[] values = new int[10];
    for(int i =0;i<5;i++) {
      System.out.println("数字を入力してください");
      values[i]= new java.util.Scanner(System.in).nextInt();
    }
    for( int i = 0 ; i < 5 ; i++ ){
      for( int j = i + 1 ; j < 5 ; j++ ){
        if( values[i] > values[j] ){
          int t = values[i];
          values[i] = values[j];
          values[j] = t;
        }
      }
    }
    
    for( int i = 0 ; i < 5 ; i++ ){
      System.out.print( values[i] + " " );
    }
  }
}
