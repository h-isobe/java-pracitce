//リスト7-2 計算処理が完了したらメモ帳を起動する
public class Main { 
  public static void main(String[] args) throws Exception {
    System.out.println("計算を開始します");
    //この間に計算処理を行う
    System.out.println("計算完了。結果をメモ帳で表示します。");
    ProcessBuilder pb = new ProcessBuilder("c:¥¥windows¥¥system32¥¥notepad.exe", "calcreport.txt");  //メモ帳の実行ファイル
    pb.start();  //起動！
  }
}