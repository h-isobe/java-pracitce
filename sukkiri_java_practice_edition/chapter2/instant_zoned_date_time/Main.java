// リスト2-2 InstantおよびZonedDateTImeの利用例
import java.time.*;

public class Main {
  public static void main(String[] args) {
    //Instantの生成
    Instant i1 = Instant.now(); //現在日時を取得。newは使えない。

    //Instantとlong値との相互変換
    Instant i2 = Instant.ofEpochMilli(31920291332L);  //long値をInstantに
    long l = i2.toEpochMilli();                       //i2のInstantをlong値に

    //ZonedDateTimeの生成
    ZonedDateTime z1 = ZonedDateTime.now();  //現在日時を取得。
    ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));  //東京時間2014年1月2日3じ4分5秒6ナノ秒を取得

    //InstantとZonedDateTimeの相互変換
    Instant i3 = z2.toInstant();                               //z2のZonedDateTimeをInstantに
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));  //i3のInstantをZonedDateTimeに

    //ZonedDateTimeの利用
    System.out.println("東京:" + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());
    System.out.println("ロンドン:" + z3.getYear() + z3.getMonthValue() + z3.getDayOfMonth());
    if (z2.isEqual(z3)) {  //同じ瞬間の判定は、equals()ではなくisEqual()を使う
      System.out.println("これらは同じ瞬間を指しています");
    }

  }
}