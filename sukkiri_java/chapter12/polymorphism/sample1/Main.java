//コード12-4 Wizardにfireballを使わせる（エラー）
public class Main {
  public static void main(String[] args) {
    Wizard w = new Wizard();
    Character c = w;  //Character型の変数に代入
    Matango m = new Matango();
    c.name = "アサカ";
    c.attack(m);  //attack()は呼び出せる
    c.fireball(m);  //この行でエラーが発生する

    /*
    WizardインスタンスをあいまいなCharacter型として捉えることで、
    「厳密には何型のインスタンスだったか」が分からなくなってしまう。
    ■attack()はインスタンスがHeroでもWizardでもCharacterの一種である限り
    attack()は継承して持っているはず
    ■fireball()はインスタンスがHeroの場合などの可能性もある。
    その場合、fireball()を持っているとは限らないから。
    */
     
  }
}