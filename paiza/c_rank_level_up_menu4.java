import java.util.*;

public class c_rank_level_up_menu4 {
  public static void main(String[] args) {
    //ソート

    //STEP: 1 昇順ソート
    System.out.println("STEP: 1 昇順ソート");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] array = new int[num];
    for(int i = 0; i < num; i++) {
      array[i] = sc.nextInt();
    }
    Arrays.sort(array);
    for(int a : array) {
      System.out.println(a);
    }


    //STEP: 2 降順ソート
    System.out.println("STEP: 2 降順ソート");
    Scanner sc2 = new Scanner(System.in);
    int n = sc2.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    Collections.sort(list);
		Collections.reverse(list);
		for(int a : list) {
      System.out.println(a);
		}
  }
}