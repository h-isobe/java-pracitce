//コード15-6 文字列パターンを用いたプレイヤー名のチェック
public boolean isValidPlayerName(String name) {
  return name.matches("[A-Z][A-Z0-9]{7}")  //文字列パターン
}