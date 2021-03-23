import java.util.Scanner;
import java.util.Arrays;

public class c_rank_level_up_menu2 {
  public static void main(String[] args) {
    //forループ

    //STEP: 1 3の倍数のカウント
    System.out.println("STEP: 1 3の倍数のカウント");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] array = new int[num];
    int count = 0;
    for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
    }
    for(int i = 0; i < array.length; i++) {
        if(array[i] % 3 == 0) {
            count++;
        }
    }
    System.out.println(count);


    //STEP: 2 フラグ管理
    System.out.println("STEP: 2 フラグ管理");
    Scanner sc2 = new Scanner(System.in);
    int num2 = sc2.nextInt();
    Integer[] array2 = new Integer[num2];
    for(int i = 0; i < array2.length; i++) {
        array2[i] = sc2.nextInt();
    }
    if(Arrays.asList(array2).contains(7)) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }


    //STEP: 3 インデックス取得
    System.out.println("STEP: 3 インデックス取得");
    Scanner sc = new Scanner(System.in);
    //num人
    int num = sc.nextInt();
    //空のnum人分の配列
    int[] array = new int[num];
    //配列人数分の各自の財産を入力
    for(int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
    }
    //財産k円
    int k = sc.nextInt();
    //配列から財産kと一致する配列番号を取得
    //indexOfを使うためArraysListクラスからListを生成
    //作成済みのarray配列の要素を1つずつ空のリスト配列に格納
    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < array.length; i++) {
        list.add(array[i]);
    }
    System.out.println(list.indexOf(k) + 1);
    
  }
}

