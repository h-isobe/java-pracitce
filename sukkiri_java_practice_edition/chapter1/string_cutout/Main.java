//文字列切り出しメソッドを利用した例
public class Main {
  public static void main(String[] args) {
    String s1 = "Java programming";
    System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
    System.out.println("文字列s1の4~7文字目は" + s1.substring(3, 8));  //8文字目は含まれない点に注意
  }
}