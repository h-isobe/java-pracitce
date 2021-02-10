public class Main {
  public static void main(String[] args) {
    Hero h = new Hero("ミナト");  //インスタンス生成後、JVMがコンストラクタを呼び出す

    System.out.println(h.hp);
    System.out.println(h.name);
  }
}