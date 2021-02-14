public class Dancer extends Character {
  public void dance() {
    System.out.println(this.name + "は情熱的に踊った！");
  }
  //詳細未定のattackメソッドを継承しているため、抽象メソッドをオーバーライドしないとエラーがでる
  //下記で親から継承した「詳細未定のattack()を上書きする
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("敵に3ポイントのダメージを与えた！");
    m.hp -= 3;
  }
}