public class Main {
  public static void main(String[] args) {
    Hero h = new Hero("ミナト");  //インスタンス生成後、JVMがコンストラクタを呼び出す

    System.out.println(h.hp);
    System.out.println(h.name);

    //コンストラクタをオーバーロードしたクラスの利用
    Hero h1 = new Hero("アサカ");
    System.out.println(h1.name);
    Hero h2 = new Hero();
    System.out.println(h2.name);
  }
}