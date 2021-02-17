public class Hero {
  private int hp;  //hpフィールドをprivateに
  String name;
  Sword sword;

  public void bye() {
    System.out.println("勇者は別れを告げた");
  }
  public void sleep() {
    this.hp += 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  //dei()メソッドをprivateにして外部クラスからは直接呼び出せないように
  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVERです。");
  }
  //勇者は戦うのが仕事のため、attack()メソッドはpublicしてどのようなクラスからも呼び出せるように
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
    this.hp -= 2;
    if (this.hp <= 0) {
      this.die();  //attack()メソッドからの呼び出しは可能
    }
  }
}