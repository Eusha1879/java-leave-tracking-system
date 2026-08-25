import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        //Create scanner
        Scanner scanner =new Scanner(System.in);
        Employee employee = null;
        LeaveRequest leaverequest = null;

        int choice =0 ;
        while(choice != 5) {
            System.out.println();
            System.out.println("==============================");
            System.out.println("     LEAVE TRACKING SYSTEM- V1");
            System.out.println("==============================");
            System.out.println("1. Create Employee");
            System.out.println("2. Submit Leave Request");
            System.out.println("3. View Employee");
            System.out.println("4. View Leave Request");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("===Create Employee===");
                System.out.print("Enter Employee Id");
                int employeeId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Employee Name");
                String name = scanner.nextLine();
                System.out.print("Enter Employee Department");
                String department = scanner.nextLine();
                System.out.print("Enter Office Email.eg: example@mcr.ie");
                String email = scanner.nextLine();
                System.out.print("Enter leave balance");
                float leaveBalance = scanner.nextFloat();



                employee = new Employee(
                        employeeId,
                        name,
                        department,
                        email,
                        leaveBalance

                );
                System.out.println();
                System.out.println("Employee created successfully!");
            } else if (choice == 2) {

                System.out.print("Submit Leave Request Selected ");
            } else if (choice == 3) {
                System.out.print("View Employee Selected ");
            } else if (choice == 4) {
                System.out.print("View Leave Request Selected ");
            } else if (choice == 5) {
                System.out.print("Exit");
            } else {
                System.out.println("Invalid choice, please choose between 1 to 5");
            }
        }



        scanner.close();




    }
}
