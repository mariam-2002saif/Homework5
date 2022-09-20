public class employee {
    private String name;
    private double salary,raise;
    public employee(String em_name,double cur_salary){
        name=em_name;
        salary=cur_salary;
    }
    public String getName(){return name;}
    public double getSalary(){return salary;}
    public void setRaise(double per){
        raise=((salary*per)/100);
        salary=salary+raise;
    }
}
