public class Account {
  private String accountNo;
  private int balance;
  private AccountType accountType;

  public Account(String aNo, AccountType aType) {
    this.accountNo = aNo;
    this.accountType = aType;
  }

  public void setAccountType(AccountType aType) {
    this.accountType = aType;
  }
  public AccountType getAccountType() {
    return this.accountType;
  }
}