import java.util.*;
import java.util.stream.*;

class Employee{
  private int id;
  private String name;
  private int age;

  Employee(int id, String name, int age){
    this.id = id;
    this.name = name;
    this.age = age;
  }
  
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
}
public class Main {
  public static void main(String[] args) {
      List<Employee> list = new ArrayList<>();
      list.add(new Employee(1, "Mahesh", 27));
      list.add(new Employee(2, "sures", 50));
      list.add(new Employee(3, "rames", 40));
      list.add(new Employee(4, "raj", 60));
      list.add(new Employee(5, "surya", 30));
      list.stream().filter((emp)-> emp.getAge() > 40).forEach((emp)-> System.out.println(emp.getName()+" "+ emp.getAge()));
  }
}
