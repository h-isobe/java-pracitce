import java.util.*;


public class c_rank_level_up_menu3 {
  public static void main(String[] args) {
    //文字列
    
    //STEP: 1 整数と文字列
    System.out.println("STEP: 1 整数と文字列");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String[] array = new String[num];
    for(int i = 0; i < array.length; i++) {
        array[i] = sc.next();
    }
    for(String a : array) {
        System.out.println(a.length());
    }


    //STEP: 2 部分文字列
    System.out.println("STEP: 2 部分文字列");
    Scanner sc2 = new Scanner(System.in);
    String a = sc2.nextLine();
    String S = sc2.nextLine();
    if(S.contains(a)) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }


    //STEP: 3 数字の文字列操作（基本）
    


    //STEP: 4 数字の文字列操作（0埋め）
    System.out.println("STEP: 4 数字の文字列操作（0埋め）");
    Scanner sc4 = new Scanner(System.in);
    String n = sc4.nextLine();
    if(n.length() == 1) {
        System.out.println(n.format("%03d", Integer.parseInt(n)));
    } else if(n.length() == 2) {
        System.out.println(n.format("%03d", Integer.parseInt(n)));
    } else {
        System.out.println(n);
    }
  }
}