//リスト7-4 システムプロパティの設定
public class Main {
  public static void main(String[] args) {
    String ver = System.getProperty("rpg.version");
    String author = System.getProperty("rpg.author");
    System.out.println("RPG: スッキリ魔王征伐 ver" + ver);
    System.out.println("Developed by" + author);
  }
}

//実行結果
/* > java -D rpg.version=0.3 -D rpg.author=湊 Main
   RPG: スッキリ魔王征伐 ver0.3
   Developed by 湊
*/ 