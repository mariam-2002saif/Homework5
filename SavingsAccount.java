public class SavingsAccount {
    private double belance ,interest;
    public SavingsAccount(double intial_belance)
    {belance=intial_belance;
    interest=((belance*10)/100);}
    public void addinter()
    {belance=belance+interest;}
    public void getbelance()
    {
        System.out.println(belance);
    }
}
