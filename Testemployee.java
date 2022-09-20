public class Testemployee {
    public static void main(String[] args) {
        employee employees=new employee("mariam",1000);
        System.out.println(employees.getName());
        System.out.println(employees.getSalary());
        employees.setRaise(10);
        System.out.println(employees.getSalary());
    }
}
