public class tallycounter {
    private int counter ;

    public  tallycounter(){counter=0;}
    public void setclick(){counter=counter+1;}
    public void getvalue(){
        System.out.println(counter);
    }
public void undo(){
        if (Math.max(counter,0)==counter&&counter!=0)
        {counter=counter-1;
            System.out.println(counter);}
        else
            System.out.println(0);
}
    }

