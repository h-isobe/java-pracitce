//コード14-7 名前が同じなら同じ勇者とするequals()を定義
public class Hero {
  String name;
  int hp;

  public boolean equals(Object o) {
    if (this == o) {
      return true;  //等値なら間違いなく等値(アドレスが同じ)
    }
    if (o instanceof Hero) {
      Hero h = (Hero) o;
      if (this.name.equals(h.name)) {
        return true;  //名前が等しければ等価(内容が同じ。アドレスは関係ない。)
      }
    }
    return false;
  }
}