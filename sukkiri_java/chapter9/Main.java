//コード9-4 剣を装備した勇者を生み出す
public class Main {
  public static void main(String[] args) {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Sword s2 = new Sword();
    s2.name = "氷の剣";
    s2.damage = 8;

    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    h.sword = s;

    System.out.println(h.name + "の現在の武器は" + h.sword.name);
    System.out.println("攻撃力は" + h.sword.damage);
    h.attack(h.sword.damage);

    Hero h2 = new Hero();
    h2.name = "アサカ";
    h2.hp = 80;
    h2.sword = s2;

    System.out.println(h2.name + "の現在の武器は" + h.sword.name);
    System.out.println("攻撃力は" + h2.sword.damage);
    h2.attack(h2.sword.damage);

  }
}