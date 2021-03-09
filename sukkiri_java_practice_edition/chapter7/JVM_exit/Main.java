//リスト7-1 System.exit()を使ったプログラムの終了
public class Main {
  public static void main(String[] args) {
    /*何らかのデータを読み込む処理*/
    if(/*データが正しくないなら*/) {
      System.out.println("データが壊れています。以上終了します。");
      System.exit(1);  //ここでJVMを異常終了。int型の引数を与えることができ、多くのOSでは0は正常終了を、0以外は異常終了を意味する。
    }
    System.out.println("正常終了しました。");
  }
}