import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    //九九の表
    for(int i = 1; i < 10; i++) {
      for(int j = 1; j < 10; j++) {
        System.out.print(i * j);
        if(j < 10-1) {
          System.out.print(",");
        }
      }
      System.out.println(" ");
    }

    //break文
    for(int i = 1; i < 10; i++) {
      if(i == 3){
        break;
      }
      System.out.println(i);
    }

    //continue文
    for(int i = 1; i < 10; i++) {
      if(i == 5) {
        continue;
      }
      System.out.print(i);
    }

    //switch文
    System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
    Scanner sc = new Scanner(System.in);
    int selected = sc.nextInt();
    switch(selected) {
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
      default:
        System.out.println("選択し直してください");
    }

    //数あてゲーム
    System.out.println("【数あてゲーム】");
    int ans = (int)(Math.random() * 10);
    for(int i = 0; i < 5; i++) {
      System.out.println("0〜9の数字を入力してください");
      Scanner sc2 = new Scanner(System.in);
      int num = sc2.nextInt();
      if(num == ans) {
        System.out.println("アタリ！");
      } else {
        System.out.println("ハズレ");
      }
    }
    System.out.println("ゲームを終了します");

    //配列 + forループ
    System.out.println("5教科の点数");
    int[] scores = {20, 30, 40, 50, 80};
    int sum = 0;
    int count = 0;
    for(int i = 0; i < scores.length; i++) {
      sum += scores[i];
      if(scores[i] >= 50) {
        count++;
      }
    }
    int avg = sum / scores.length;
    System.out.println("合計点:" + sum);
    System.out.println("平均点:" + avg);
    System.out.println("50点以上の教科数:" + count);

    int[] seq = new int[10];
    for(int i = 0; i < seq.length; i++) {
      seq[i] = (int)(Math.random() * 4);
    }
    for(int i = 0; i < seq.length; i++) {
      switch(seq[i]) {
        case 0:
        System.out.print("A ");
        break;
        case 1:
        System.out.print("T ");
        break;
        case 2:
        System.out.print("G ");
        break;
        case 3:
        System.out.print("C ");
        break;
      }
    }
  }
}