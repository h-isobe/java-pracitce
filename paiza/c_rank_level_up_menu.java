import java.util.Scanner;

public class c_rank_level_up_menu {
  public static void main(String[] args) {
        //STEP: 1 単純な入出力
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);


        //STEP: 2 複数行にわたる出力
        Scanner sc2 = new Scanner(System.in);
        int num = sc2.nextInt();
        for(int i = 0; i < num; i++) {
          System.out.println("paiza");
        }


        //STEP: 3 複数行にわたる入力
        Scanner sc3 = new Scanner(System.in);
        int count = sc3.nextInt();
        for(int i = 0; i < count; i++) {
            int num = sc3.nextInt();
            System.out.println(num);
        }


        //STEP: 4 入力の配列による保持
        Scanner sc4 = new Scanner(System.in);
        int count = sc4.nextInt();
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            array[i] = sc4.nextInt();
        }
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);


        //STEP: 5 半角スペース区切りでの出力
        Scanner sc5 = new Scanner(System.in);
        int count = sc5.nextInt();
        for(int i = 0; i < count; i++) {
            System.out.print("paiza");
            if(i < count-1) {
              System.out.print(" ");
            }
        }
  }
}