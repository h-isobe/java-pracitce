//コード12-9 Monsterなら何でも攻撃できるattack()メソッド
public class Hero extends Characte {
  public void attack(Monster m) {  //モンスター攻撃用
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に10ポイントのダメージを与えた！");
    m.hp -= 10;
  }
}