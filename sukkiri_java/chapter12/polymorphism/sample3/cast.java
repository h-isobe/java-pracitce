public class cast {
  //キャスト

  //ダウンキャスト
  Character c = new Wizard();
  Wizard w = (Wizard) c;  //黙ってWizardとみなせ！(失敗の危険が伴う)

  //キャストの失敗
  Character c = new Wizard();
  Wizard w = (Hero) w;  //黙ってHeroとみなせ！（コンパイルエラー。ClassCastException）

  //インスタンスを代入可能かチェックする
  //もしcの中身がSuperHeroとみなして大丈夫なら、、、
  if (c instanceof SuperHero) {
    //SuperHeroとみなせ！
    SuperHero sh = (SuperHero) c;
    sh.fly();
  }
}