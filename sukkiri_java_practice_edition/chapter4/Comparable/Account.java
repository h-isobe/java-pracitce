//リスト4-7 Comparableインターフェイスの実装(自然順序付けを宣言する)
public class Account implements Comparable<Account> {  //<~>で自身を指定
  int number;

  public int compareTo(Account obj) {  //インターフェイスを実装するとcompareTo()メソッドのオーバーライドが強制される
    if (this.number < obj.number) {
      return -1;
    }
    if (this.number > obj.number) {
      return 1;
    }
    return 0;
  }
}

//compareTo()メソッドは、引数で渡されてきたインスタンスobjと自分自身とを比較し、その大小関係を判定するメソッド