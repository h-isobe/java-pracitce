//リスト12-3 SQL送信パターン②検索系(SQL記述箇所のみ)
・
・
Connection con = null;
・
・

// ① 送信すべきSQL文の雛形を準備
PreparedStatement pstmt = con.preparedStatement("SELECT * FROM MONSTERS WHERE HP > ?");
// ② 雛形に流し込みSQL文を組み立てて送信する
pstmt.setInt(1, 10);  //1番目の?に10を流し込む
ResultSet rs = pstmt.executeQuery();  //検索系SQL文の送信。戻り値ResultSetオブジェクトとして返される。
// ③ 結果表を処理する
//リスト12-4 結果表処理パターン①(複数行)
//SELECT * FROM MONSTERSの場合
while(rs.next()) {  //次の行に進むことが可能。trueであれば。結果表の全行を順に処理
  System.out.println(rs.getString("NAME")); //注目行の処理
}
//リスト12-5 結果表処理パターン②(単一行)
//SELECT * FROM MONSTERS WHERE NAME = "ゴブリン"の場合
if(rs.next()) {  //検索結果があるかないかによって判定
  System.out.println("ゴブリンのHPは" + rs.getInt("HP"));
} else {
  System.out.println("ゴブリンはDBに存在しません");
}
