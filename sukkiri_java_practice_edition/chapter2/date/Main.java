import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Date now = new Date();  //現在の日時を取得
    System.out.println(now);
    System.out.println(now.getTime());  //getTimeでlong値を取得
    Date past = new Date(1316622225935L);  //引数にlong値を渡してインスタンス化すると、指定時刻の情報が格納される
    System.out.println(past);

    //Dataクラスは人間には使いにくい
    //Java8で加わったJava.timeパッケージのTime APIを使う
  }
}