//コード9-4 剣を装備した勇者を生み出す
public class Main {
  public static void main(String[] args) {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Sword s2 = new Sword();
    s2.name = "氷の剣";
    s2.damage = 8;

    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    h1.sword = s;

    Hero h2 = new Hero();
    h2.name = "アサカ";
    h2.hp = 80;
    h2.sword = s2;

    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
    w.heal(h2);

    System.out.println(h1.name + "の現在の武器は" + h1.sword.name);
    System.out.println("攻撃力は" + h1.sword.damage);
    h1.attack(h1.sword.damage);

    System.out.println(h2.name + "の現在の武器は" + h2.sword.name);
    System.out.println("攻撃力は" + h2.sword.damage);
    h2.attack(h2.sword.damage);

  }
}