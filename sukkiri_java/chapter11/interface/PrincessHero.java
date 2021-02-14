//インターフェイスによる多重継承(Hero, Princess, Characterをインターフェイスとして)
//多重継承ができるのはインターフェイスの特権
//同じ名前でありながら、異なるメソッドを継承してもどちらもメソッドの内容を定めていないため
public class PrincessHero implements Hero, Princess, Character {

}