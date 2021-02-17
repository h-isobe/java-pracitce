//コード14-5 意図する文字列表現を返すtoString()を定義
public class Hero {
  String name;
  int hp;

  public String toString() {  //オーバーライドする
    return "名前：" + this.name + "/HP：" + this.hp; 
  }

  //インスタンスを作成して、h.toString()で表示できる
}