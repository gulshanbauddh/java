package practice1;
class Employee{
  private int id;
  private int salary;
  private String name;
  private String address;
  public Employee(int id, int salary, String name, String address) {
    this.id = id;
    this.salary = salary;
    this.name = name;
    this.address = address;
  }
  public void EmpDisplay(){
    System.out.println("1. Employee Display: ");
    System.out.println("2. Employee ID: "+id);
    System.out.println("3. Employee Salary: "+salary);
    System.out.println("4. Employee Name: "+name);
    System.out.println("5. Employee Address: "+address);
  }
}

public class EmployeeDetails  {
  public static void main(String[] args) {
    Employee EmpGulshan=new Employee(101,48000,"Gulshan", "Siddharthnagar UP");
    EmpGulshan.EmpDisplay();
    System.out.println("Gulshan Bauddh");
  }
}