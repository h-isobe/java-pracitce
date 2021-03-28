import java.util.Scanner;
import java.util.Arrays;

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


    //STEP: 3 指定された行数の数字の出力
    System.out.println("STEP: 3 指定された行数の数字の出力");
    Scanner sc3 = new Scanner(System.in);
    int n3 = sc3.nextInt();
    for(int i = 0; i < n3; i++) {
      for(int j = 1; j <= 5; j++) {
        if(j < 5) {
          System.out.print(j);
          System.out.print(" ");  
        } else {
          System.out.println(j);
        }
      }
    }


    //STEP: 4 指定された範囲・行数の数字の出力
    System.out.println("STEP: 4 指定された範囲・行数の数字の出力");
    Scanner sc4 = new Scanner(System.in);
    int[] array4 = Arrays.stream(sc4.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();  //標準入力 5 8 (1から5までの8行)
    //1から5までの数字を8行分出力
    for(int i = 1; i <= array4[1]; i++) {    //8行分
      for(int j = 1; j <= array4[0]; j++) {  //1から5を
        if(j < array4[0]) {
          System.out.print(j);
          System.out.print(" ");
        } else {
          System.out.println(j);
        }
      }    
    }


    //STEP: 5 二次元配列の出力
    System.out.println("STEP: 5 二次元配列の出力");
    Scanner sc5 = new Scanner(System.in);
    int[] array5 = Arrays.stream(sc5.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();  //3行 4列
    int[] arr5 = new int[array5[1]];
    int count5 = 0;
    for(int i = 0; i < array5[0]; i++) {  //3行分
      for(int j = 0; j < array5[1]; j++) {
        arr5[j] = sc5.nextInt();
      }
      for(int a5 : arr5) {
        if(count5 < array5[1]) {
            System.out.print(a5);
            System.out.print(" ");
        } else {
            System.out.println(a5);
        }
      }
      System.out.println(" ");
    }

  }
}