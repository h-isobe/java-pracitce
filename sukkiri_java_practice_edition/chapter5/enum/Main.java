public class Main {
  public static void main(String[] args) {
    Account a = new Account("1732050", AccountType.FUTSU);  //列挙型で定義しているので、AccountType.の書き方になる。import省略もある。
    //a.setAccountType(AccountType.TOUZA); 
    System.out.println(a.getAccountType());
  }
}