//リスト10-9 勇者インスタンスを保存し、復元するサンプルコード
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Hero hero1 = new Hero("ミナト", 75, 18);                         //インスタンス生成
    //①インスタンスの直列化と保存
    FileOutputStream fos = new FileOutputStream("c:¥¥rpgsave.dat");  //FileOutputStream生成
    ObjectOutputStream oos = new ObjectOutputStream(fos);            //ObjectOutputStream生成してファイルをストリーム経由で保存
    oos.writeObject(hero1);               //インスタンス→バイト列
    oos.flush();
    oos.close();
    //②ファイルからインスタンスを復元
    FileInputStream fis = new FIleInputStream("c:¥¥rpgsave.dat");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Hero hero2 = (Hero) ois.readObject();  //バイト列→インスタンス
    ois.close();
  }
}