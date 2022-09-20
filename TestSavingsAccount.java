public class TestSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount acount=new SavingsAccount(1000);
        acount.addinter();
        acount.getbelance();
        System.out.println("Expected belance="+1100 );
    }
}
