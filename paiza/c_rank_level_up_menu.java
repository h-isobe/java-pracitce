import java.util.Scanner;

public class c_rank_level_up_menu {
  public static void main(String[] args) {
        //STEP: 1 単純な入出力
        System.out.println("STEP: 1");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);


        //STEP: 2 複数行にわたる出力
        System.out.println("STEP: 2");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        for(int i = 0; i < num2; i++) {
          System.out.println("paiza");
        }


        //STEP: 3 複数行にわたる入力
        System.out.println("STEP: 3");
        Scanner sc3 = new Scanner(System.in);
        int count3 = sc3.nextInt();
        for(int i = 0; i < count3; i++) {
            int num = sc3.nextInt();
            System.out.println(num);
        }


        //STEP: 4 入力の配列による保持
        System.out.println("STEP: 4");
        Scanner sc4 = new Scanner(System.in);
        int count4 = sc4.nextInt();
        int[] array = new int[count4];
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
        System.out.println("STEP: 5");
        Scanner sc5 = new Scanner(System.in);
        int count5 = sc5.nextInt();
        for(int i = 0; i < count5; i++) {
            System.out.print("paiza");
            if(i < count5 -1) {
              System.out.print(" ");
            }
        }


        //STEP: 6 改行区切りでの出力
        System.out.println("STEP: 6");
        Scanner sc6 = new Scanner(System.in);
        int num = sc6.nextInt();
        int[] array6 = new int[num];
        for(int i = 0; i < array6.length; i++) {
          array6[i] = sc6.nextInt();
        }
        for(int a6 : array6) {
          System.out.println(s);
        }


        //FINAL問題 標準入出力
        System.out.println("STEP: FINAL");
        Scanner sc7 = new Scanner(System.in);
        //社員数
        int count7 = sc7.nextInt();
        //名前と年齢を入力
        String name7;
        int age7;
        for(int i = 0; i < count7; i++) {
            name7 = sc7.next();    //nextLine()ではなくnext()で空白までを認識。例)入力がTanaka 18だとTanakaまでを認識。
            age7 = sc7.nextInt();  
        System.out.print(name7+" ");
        System.out.println(age7+1);
        }
  }
}