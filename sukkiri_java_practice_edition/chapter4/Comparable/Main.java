//リスト4-6 口座インスタンスの並び替え
import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Account> list = new ArrayList<Account>();
    
    Collections.sort(list);  //=> エラーになる。Accountクラスが自然順序付けが定められていないクラスのため。
  }
}