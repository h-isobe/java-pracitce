//コード12-7 多様性と配列を組み合わせて宿屋に泊まる
public class Main {
  public static void main(String[] args) {
    Chracter[] c = new Character[5];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Thief();
    c[3] = new Wizard();
    c[4] = new Wizard();
    //宿屋に泊まる
    for (Character ch : c) {  //1名ずつ順に取り出して
      c.hp += 50;             //HPを50回復する
    }

    /*
    パーティが宿屋に泊まってHPを回復するには、従来はHeroやThiefを厳密に(具体的に)扱っていたため一括でできなかった。
    しかし、それぞれをCharacterとしてザックリみなせば(抽象的に)、「どれもキャラクター」なので5つのインスタンスを
    Chracter配列にまとめ、ループを回して一括で処理が可能。
    */
  }
}