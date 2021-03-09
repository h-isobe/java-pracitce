//リスト8-3 EqualsBuilderを用いたBankクラス
import org.apache.commons.lang3.builder.*;

public class BankEqualsBuilder {
  String name;
  String address;

  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);  //たった1行でOK
  }
}