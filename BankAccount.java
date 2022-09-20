public class BankAccount {
    private double balance;
    public void Setdeposits(double amount){
        balance=balance+amount;
    }
    public void Setwithdraws(double amount){
        balance=balance+amount;
    }
    public void get_r_b(){
        System.out.println(balance);
    }
    public void Addinterest()
    {
        double rate=((balance*10)/100);
        balance=balance+rate;
    }

}
