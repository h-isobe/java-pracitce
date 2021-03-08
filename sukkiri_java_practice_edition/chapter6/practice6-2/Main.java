//練習問題6-2のFuncListクラスの2つのメソッドをラムダ式にしてFunc1とFunc2に代入する文
Func1 f1 = x -> x % 2 == 1;
Func2 f2 = (male, name) -> {
  if (male == true) {
    return "Mr." + name;
  } else {
    return "Ms." + name;
  }
}