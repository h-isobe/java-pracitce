//リスト12-1 JDBCを操作する基本パターン
import java.sql.*; 

・
・
// STEP 0: 事前準備（JAR配置を含む）
try {
  Class.forName(JDBCドライバの完全限定名);  //JDBCドライバのロード(有効化)
} catch(ClassNotFoundException e) {
  e.printStackTrace();  //JDBCドライバJARが見つからない場合の処理
}
・
・
Connection con = null;
try {
  // STEP 1: データベースの接続
  con = DriverManager.getConnection(JDBC URL);  //引数にJDBC URLを指定
  // STEP 2: SOL送信処理
  /* ***************************
     メインのDB操作処理
  *****************************/
} catch(SQLException e) {
  e.printStackTrace();  //接続やSQL処理の失敗時の処理を続きに書く
} finally {
  // STEP 3: データベース接続の切断
  if(con != null) {
    try {
      con.close();
    } catch(SQLException e) {
      e.printStackTrace();  
    }
  }
}