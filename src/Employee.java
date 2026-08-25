public class Employee {     //creating Class
    private int employeeId;
    private String name;
    private String department;                  //adding 5 private fields
    private String email;
    private float leaveBalance;

    public Employee(int employeeId, //adding Constructor
                    String name,
                    String department,
                    String email,
                    float leaveBalance) {
        //assigning all 5 constructor ^ values assigned with this. |
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.email = email;
        this.leaveBalance = leaveBalance;
    }

    public void displayInfo() {
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Enter Your department name" + department);
        System.out.println("Enter your office email.eg:example@mcr.ie" + email);
        System.out.println("leave balance : " + leaveBalance);

    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;

    }
    public float getLeaveBalance(){
        return leaveBalance;
    }
    public void setLeaveBalance(float leaveBalance){
        this.leaveBalance=leaveBalance;
    }
}
