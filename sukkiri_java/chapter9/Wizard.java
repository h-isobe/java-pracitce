//コード9-6 勇者と魔法使いを生み出す
public class Wizard {
  String name;
  int hp;
  public void heal(Hero h) {
    h.hp += 10;
    System.out.println(h.name + "のHPを10回復した！");
  }
}