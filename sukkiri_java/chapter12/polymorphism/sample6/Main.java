public class Main {
  public static void main(String[] args) {
    Monster[] monsters = new Monster[3];
    monsters[0] = new Slime();
    monsters[1] = new Goblin();
    monsters[2] = DeathBat();
    for (Monster m : monsters) {
      m.run();  //同じ指示を繰り返す
    }
  }
}