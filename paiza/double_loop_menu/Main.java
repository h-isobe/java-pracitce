import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    //STEP: 1 指定された数字までの出力
    System.out.println("STEP: 1 3の倍数のカウント");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++) {
      if(i < n) {
        System.out.print(i);
        System.out.print(" ");
      } else {
        System.out.println(i);
      }
    }


    //STEP: 2 指定された数字までの出力
    System.out.println("STEP: 2 指定された数字までの出力");
    Scanner sc2 = new Scanner(System.in);
    int n2 = sc2.nextInt();
    for(int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }
}