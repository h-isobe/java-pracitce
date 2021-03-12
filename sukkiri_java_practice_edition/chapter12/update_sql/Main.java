//リスト12-2 SQL送信パターン①更新系(SQL記述箇所のみ)
・
・
Connection con = null;
・
・

// ① 送信すべきSQL文の雛形を準備
PraparedStatement pstmt = con.preparedStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");
// ② 雛形に値を流し込みSQL文を組み立て送信する
pstmt.setInt(1, 10);           //1番目の?に10を流し込み
pstmt.setString(2, "ゾンビ");  //2番目の?に"ゾンビ"を流し込み
int r = pstmt.executeUpdate;   //SQL文を送信。戻り値をint型で受け取る
// ③ 処理結果を判定する
if(r != 0) {  //更新結果の行数が0件でなければ
  System.out.println(r + "件のモンスターを削除しました。");
} else {
  System.out.println("該当するモンスターはいませんでした。");
}
pstmt.close();  //後片付け