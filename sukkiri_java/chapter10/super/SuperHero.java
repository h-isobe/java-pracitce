public class SuperHero extends Hero {
  boolean flying;

  //継承しているHeroクラスは引数を指定している。
  //以下でHeroクラスのコンストラクタの引数条件で呼び出さないとエラー
  //呼び出さないとデフォルトでsuper();となり、Mainでインスタンスを生成しても引数なしエラー
  public SuperHero() {
    super("ミナト");  //引数1つの親クラスコンストラクタを呼び出す
  }

  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }

  public void attack(Matango m) {
    super.attack(m);
    if (this.flying) {
      System.out.println("追加攻撃！");
      super.attack(m);
    }
  }
}