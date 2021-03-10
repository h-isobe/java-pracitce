//リスト10-8 直列化に対応したHeroクラス
import java.io.*;

public class Hero implements Serializable {
  private String name;
  private int hp;
  private int mp;
}

//実装後に、Streamを使うことでインスタンス自体をストリーム経由で保存、復元できるようになる