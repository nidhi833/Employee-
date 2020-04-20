package Employee;
import java.util.Scanner;

public class Employee {
        
        String name,addr;
        int year;
        double salary;
        
        public void GetInput(){
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter the name of the employee: ");
          name= sc.next();
          System.out.println("Enter the address of employee: ");
          addr= sc.next();
          System.out.println("Enter the joining year of employee: ");
          year=sc.nextInt();
          System.out.println("Enter the salary of the employee: ");
          salary=sc.nextDouble();
       
        }
        
  public void Display(){
   System.out.println("Name:"+name);
   System.out.println("Address:"+addr);
      System.out.println("Joining year: "+year);
      System.out.println("Salary: "+salary);
      }
      
      
  public static void main(String[] args){
      int n;
      System.out.println("Enter the no. of employee: ");
      Scanner s =new Scanner(System.in);
      n= s.nextInt();
      
      Employee e[]=new Employee[n];
     
      for(int i=0;i<n;i++){
        e[i]=new Employee();
        e[i].GetInput();
      }
      System.out.println();
      System.out.println("Details of the employee are printed below:");
      System.out.println();
      for(int i=0;i<n;i++)
      e[i].Display();
      }
    }
