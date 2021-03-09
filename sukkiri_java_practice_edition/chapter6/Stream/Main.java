// Streamによる関数の活用（stream()メソッド）

//①List<Integer> list1の各要素の2倍を表示する
for (Integer i : list1) {
  System.out.println(i * 2);
}
//②List<Charecter> list2の各要素に対してsleep()メソッドを呼び出す
for (Character c : list2) {
  c.sleep();
}

//以下は上記をラムダ式で記述すると。。。

//①List<Integer> list1の各要素の2倍を表示する
list1.stream().forEach(i -> System.out.println(i * 2));

//②List<Charecter> list2の各要素に対してsleep()メソッドを呼び出す
list2.stream().forEach(c -> c.sleep());
