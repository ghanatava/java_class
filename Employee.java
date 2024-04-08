
class Employee{
    private int eid;
    private String name;
    private int sal;
    private String branch;

    public Employee(int eid){
        super();
        this.eid = eid;
    }

    // constructor chaining 

    public Employee(int eid,String name){
        this(eid);
        this.name = name;
    }

    public Employee(int eid,String name,int sal){
        this(eid,name);
        this.sal = sal;
    }

    public Employee(int eid,String name, int sal, String branch){
        this(eid,name,sal);
        this.branch = branch;
    }

    public static void main(String args[]) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee(1, "John", 24000, "corporate");
        employees[1] = new Employee(2, "Jane", 24032, "HR");
        employees[2] = new Employee(3, "Josh", 25000, "sales");
        employees[3] = new Employee(4, "ryan", 20000, "sales");
        employees[4] = new Employee(5, "Ron", 12999, "corporate");
        employees[5] = new Employee(6, "Greg", 12999, "sales");
        employees[6] = new Employee(7, "George", 18000, "Finance");
        employees[7] = new Employee(8, "Emily", 20000, "finance");
        employees[8] = new Employee(9, "Austin", 18299, "HR");
        employees[9] = new Employee(10, "Schltz", 28199, "finance");
        
        Employee highestPaidEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].sal > highestPaidEmployee.sal) {
                highestPaidEmployee = employees[i];
            }
        }
        
        System.out.println("Employee with the highest salary:");
        System.out.println("Employee ID: " + highestPaidEmployee.eid);
        System.out.println("Name: " + highestPaidEmployee.name);
        System.out.println("Salary: " + highestPaidEmployee.sal);
        System.out.println("Branch: " + highestPaidEmployee.branch);
    }

        
}


