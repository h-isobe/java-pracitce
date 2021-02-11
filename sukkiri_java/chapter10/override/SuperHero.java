public class SuperHero extends Hero {
  boolean flying;
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }
  //親クラスに定義しているが、子クラスで再定義するメソッド(オーバーライド)
  public void run() {
    System.out.println(this.name + "は退散した！");
  }
}
