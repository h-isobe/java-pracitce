//リスト12-6 基本パターンコード(トランザクション利用時)
import java.sql.*;
・
・
//STEP 0: 事前準備(JAR配置を含む)
try {
  Class.forName(JDBCドライバの完全限定名);
} catch(ClassNotFoundException e) {
  e.printStackTrace();
}
・
・
Connection con = null;
try {
  //STEP 1: データベースの接続
  con = DriverManager.getConnection(JDBC URL);
  con.setAutoCommit(false); //自動コミットから手動コミットに切り替え
  //STEP 2: SQL送信処理
  /* *****メインのDB処理(SQL送信)***** */
  con.commit();  //コミット
} catch(SQLException e) {
  try {
    con.rollback();  //ロールバック
  } catch(SQLException e2) {
    e2.printStackTrace();  //接続やSQL処理の失敗時の処理を続きに書く
  } finally {
    //STEP 3: データベース接続の切断
    if(con != null) {
      try {
        con.close();
      } catch(SQLException e3) {
        e3.printStackTrace();  //切断失敗時の処理を続きに書く
      }
    }
  }
}