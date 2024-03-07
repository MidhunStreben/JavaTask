public class Employee {
    String name;
    String Jobtile;
    int salary;
    public void Mymethod(String name,String Jobtile,int salary){
        this.name=name;
        this.Jobtile=Jobtile;
        this.salary=salary;
        System.out.println("Employee Name :"+name);
        System.out.println("Job Title :"+Jobtile);
        System.out.println("the salary of Employee:"+salary);
        
    }

    public static void main(String[] args) {
        Employee Emp1 =new Employee();
        Employee Emp2 =new Employee();
        Employee Emp3 =new Employee();
        Emp1.Mymethod("Midhun", "Software Engineer", 125000);
        Emp2.Mymethod("Haritha sunil", "Software Engineer", 225000);
        Emp2.Mymethod("Asritha p Sunil", "Civil Engineer", 15000);

        
    }
}
