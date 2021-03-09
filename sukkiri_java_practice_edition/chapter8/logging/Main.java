//リスト8-5 commons- loggingによるエラーログの出力
import org.apache.commons.logging.*;

public class Main {
  public static void main(String[] args) {
    Log logger = LogFactory.getLog(Main.class); //ロガーの取得
    if(args.length != 2) {
      Logger.error("起動引数の数が異常:" + args.length);
    }
  }
}