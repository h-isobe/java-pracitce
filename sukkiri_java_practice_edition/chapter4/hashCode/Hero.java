//リスト4-5 HeroクラスでhashCode()をオーバーライドする
class Hero {
  String name;
  int hp;
  
  public int hashCode() {
    int result = 37;                         //①適当な初期値を決める
    result = result * 31 + name,hashCode();  //②各フィールドに影響を与える
    result = result * 31 + hp.hashCode();
    return result;                           //③結果を返す
  }
}

/*ハッシュ計算
  ①ハッシュ値の初期値の37は整数ならなんでもよい
  ②一方、各要素の影響を与えるために用いた乗数は奇数かつ素数である31がよく用いられる
*/