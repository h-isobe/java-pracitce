//リスト10-4 プロパティファイルを読み込むコード
import java.io.*;
import java.util.*;

public class Mian {
  public static void main(String[] args) throws Exception {
    Reader fr = new FileReader("c:¥¥rpgdata.properties");
    Properties p = new Properties();
    p.load(fr);  //プロパティ形式でファイル内容を読み込む
    String name = p.getProperty("heroName");  //キーを指定し値を取り出す
    String strHp = p.getProperty("heroHp");
    int hp = Integer.parseInt(strHp);  //Propertisクラスは全てのデータを文字列として扱うため、明示的に型を変換する必要がある
    System.out.println("勇者の名前：" + name);
    System.out.println("勇者のHP：" + hp );
    fr.close();
  }
}