//抽象クラスとして宣言
//(継承専用のクラスとして、未完成のためnewしてはいけないクラスの宣言ができる)
public abstract class Character {
  String name = "ミナト";
  int hp = 100;
  
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
  //抽象メソッドとして宣言
  //（「何もしないメソッド」なのか「現時点では何をするか確定できないメソッド」として区別できる)
  public abstract void attack(Matango m);
}