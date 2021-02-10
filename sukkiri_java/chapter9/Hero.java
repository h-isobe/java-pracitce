//コード9-3 Sword型フィールドを持つHeroクラス
public class Hero {
  String name;
  int hp;
  Sword sword;

  public void attack(int power) {
    System.out.println(this.name + "は、" + this.sword.name + "で攻撃した！");
    System.out.println("敵に" + power + "ポイントのダメージを与えた！");
  }
}