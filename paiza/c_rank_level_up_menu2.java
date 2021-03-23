import java.util.Scanner;

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


  }
}

