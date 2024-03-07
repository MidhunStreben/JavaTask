public class Bankaccount {
    private long accountnumber;
    private int Balance;



    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long Newaccountnumber) {
        this.accountnumber = Newaccountnumber;
    }


    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Newbalance) {
        this.Balance = Newbalance;
    }

    public static void main(String[] args) {
    Bankaccount Myaccount= new Bankaccount();
    
    Myaccount.setAccountnumber(123454566);
    Myaccount.setBalance(12544);
    System.out.println("the account number is....:"+Myaccount.getAccountnumber());
    System.out.println("account balace is.. :"+Myaccount.getBalance());
    }


}
