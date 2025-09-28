abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public void addBonus(double bonus){
        if(bonus>0){
            this.salary+=bonus;
            System.out.println("Added bonus "+bonus);
            System.out.println("New amount "+salary);
        }
        else{
            System.out.println("Invalid bonus amount");
        }
    }
    public void deductBonus(double reduction){
            if(reduction>0 && salary>=reduction){
                this.salary-=reduction;
                System.out.println("reduction "+reduction);
                System.out.println("New amount "+salary);

            }
            else{
                System.out.println("Invalid reduction");
            }
        }
}

class Doctor extends Employee{
    public Doctor(String name, int id, double salary){
        super(name,id,salary);
    }
}

public class Hospital{
    public static void main(String args[]){
        Employee h=new Doctor("Dr. Gregory House",12,12000);
        h.addBonus(560);
        h.deductBonus(120);
    }
}