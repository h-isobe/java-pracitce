//文字列パターンを用いたプレイヤー名のチェック
boolean isValidPlayerName(String name) {
  return name.matches("[A-Z][A-Z0-9]{7}");
}

//①通常の文字：その文字でなければならない
String s = "Java"
s.matches("Java")      //=> true
s.matches("JavaJava")  //=> false
s.matches("java")      //=> false

//②ピリオド：任意の1文字であればよい
"Java".matches("J.va") //=> true

//③アスタリスク：直前の文字の0回以上の繰り返し
"Jaaaaava".matches("Ja*va")  //=> true
"あいうxx019".matches(".*")  //=> true  任意の1文字を0回以上繰り返し
s.matches("Ma.*")            //=> Maで始まる任意の文字
s.matches(".*ful")           //=> fulで終わる任意の文字

//④波カッコ：指定回数の繰り返し
"url".matches("[a-z]{3}")  //=> true
 