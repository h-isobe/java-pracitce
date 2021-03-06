// リスト2-3 LocalDateTimeの利用例（ZonedDataTimeからタイムゾーンを削ったもの）
import java.time.*;

public class Main {
  public static void main(String[] args) {
    //LocalDateTimeの生成方法
    LocalDateTime l1 = LocalDateTIme.now();  //現在日時を取得
    LocalDateTIme l2 = LocalDateTime.of(2014, 1, 1, 9, 5, 0, 0);  //2014年1月1日9じ5分を指定して取得

    //LocalDateTimeとZonedDateTimeの相互変換
    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));  //l2のLocalDateTimeをZonedDateTimeに
    LocalDateTime l3 = z1.toLocalDateTime();                   //z1のZonedDateTimeをLocalDateTimeに

    //基本的に利用するのはLocalDateTimeであり、ZonedDateTimeを使う機会はあまり多くない
  }
}