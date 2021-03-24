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

  }
}