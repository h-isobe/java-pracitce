//コード15-15 LocalDateTimeの利用例
import java.time.*;

public class Main {
  public static void main(String[] args) {
    //LocalDateTimeの生成方法
    LocalDateTime l1 = LocalDateTime.now();  //現在日時を取得。静的メソッド。
    LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);  //2020年1月1日9時5分を指定して取得
    //LocalDateTimeとZonedDateTimeの相互互換
    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/Londaon"));
    LocalDateTime l3 = z1.toLocalDateTime();
  }
}