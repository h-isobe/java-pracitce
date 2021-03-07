//リスト4-2 銀行口座クラスのequals()メソッドをオーバーライドする
public class Account {
  String accountNo;  //口座番号(先頭に空白が入ることもある)

  public boolean equals(Object o) {  //引数はObject型にすること
    if (o == this) return true;                               //①自分自身が引数として渡されてきた場合、無条件でtrueを返す。
    if (o == null) return false;                              //②nullが引数として渡されてきた場合、無条件でfalseを返す。
    if (!(o instansof Account)) return false;                 //③-1 比較して型が異なるならばfalseを返す。
    Account r = (Account) o;                                  //③-2 比較できるようにキャストする
    if (!this.accountNo.trim().equals(r.accountNo.trim())) {  //④先頭と末尾の空白を取り除いた口座番号が等しければ、等価とみなす
      return false;
    }
    return true;
  }
} 