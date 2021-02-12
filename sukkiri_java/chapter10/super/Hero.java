public class Hero {
  String name;
  int hp;

  public Hero(String name) {
    this.name = name;
    this.hp = 100;
  }
  public Hero(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた！");
  }
}