package finalassignment;

class Company{
    private String cname;

    Company(String cname){

        this.cname=cname;
    }
    public String getCname() {
        return cname;
    }

 

 

}

 

class Employee{
    private String empName;
    private int rating ;
    private int startyear;

    public Employee(String empName, int rating, int startyear) {
        this.empName = empName;
        this.rating = rating;
        this.startyear = startyear;
    }

 

    

    public String getEmpName() {
        return empName;
    }

 

    public int getRating() {
        return rating;
    }

 

    public int getStartyear() {
        return startyear;
    }

 

    

}
public class Ques1 {

 

    public static void main(String[] args) {
        Company c = new Company("TechCompany");
        Employee e = new Employee ("AAAA", 2 , 2012);
        Employee e1 = new Employee ("BBB", 6 , 2055);
        Employee e2 = new Employee ("CCCC", 8 , 2077);

        System.out.println(e.getEmpName() + " "+e.getRating()+" " + e.getStartyear() +" "+c.getCname());
        System.out.println(e1.getEmpName() + " "+e1.getRating()+" " + e1.getStartyear() +" "+c.getCname());
        System.out.println(e2.getEmpName() + " "+e2.getRating()+" " + e2.getStartyear() +" "+c.getCname());


 

    }

 

}
