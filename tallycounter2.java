import java.util.Scanner;

public class tallycounter2 {
    private int limit,click;
    public tallycounter2()
    {limit=0;
    click=0;}
    public void setLimit(){
        System.out.println("Entet the limit:");
        Scanner input=new Scanner(System.in);
        int maxm= input.nextInt();
limit=maxm;
    }
    public void setClick()
    {
        System.out.println("Entet the click:");
        Scanner input =new Scanner(System.in);
        click= input.nextInt();
    }
    public void getresult()
    {
        if(Math.min(click,limit)==click)
            System.out.println(click);
        else System.out.println(limit);
    }
}
