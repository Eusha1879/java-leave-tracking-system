import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDateTime;
public class Main {
    public static void main (String[] args){

        //Create scanner
        Scanner scanner =new Scanner(System.in);
        Employee employee = null;
        LeaveRequest leaveRequest = null;

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
            }
            //Submitting Leave Request
            else if (choice == 2) {

                System.out.println("Submit Leave Request Selected ");
                if(employee == null) {
                    System.out.println("No employee Created Yet, PLease Creat an " +
                            "employee first");
                }else{
                    System.out.print("Enter Request ID");
                    int requestId = scanner.nextInt();

                    System.out.print("Enter Employee Id");
                    int enteredEmployeeId = scanner.nextInt();
                    scanner.nextLine();

                    if(enteredEmployeeId != employee.getEmployeeId()){
                        System.out.println("Employee ID does not match");
                    }else{
                        System.out.print("Enter Start Date(YYYY-MM-DD): ");
                        String startDateText = scanner.nextLine();
                        System.out.print(
                                "Enter End Date (YYYY-MM-DD): "
                        );

                        String endDateText = scanner.nextLine();

                        LocalDate startDate = LocalDate.parse(startDateText);
                        LocalDate endDate = LocalDate.parse(endDateText);


                        if (endDate.isBefore(startDate)) {

                            System.out.println(
                                    "End date cannot be before start date."
                            );
                        }else{
                            System.out.println("Enter Leave Type");
                            String leaveType = scanner.nextLine();

                            System.out.println("Enter Reason");
                            String reason = scanner.nextLine();
                            leaveRequest = new LeaveRequest(
                                    requestId,
                                    enteredEmployeeId,
                                    startDate, endDate, leaveType, reason
                            );
                            System.out.println();
                            System.out.println("Leave request submitted successfully");

                        }
                    }

                }
            }
            //View employee
            else if (choice == 3) {
                System.out.println();
                System.out.println("____Employee Details____");
                if(employee == null){
                    System.out.println("No employee has been created yet");
                }else{
                    employee.displayInfo();
                }
            } // view Leave Request

            else if (choice == 4) {
                System.out.println();
                System.out.print("---- Leave Request Details ----");
                if(leaveRequest == null){
                    System.out.println("No leave request has been Submitted Yet.");
                }else{
                    leaveRequest.displayInfo();
                }
            } // Exit session
            else if (choice == 5) {
                System.out.println();
                System.out.println("Exiting Leave Tracking System");
                System.out.print("GoodBye");
            } else {
                System.out.println();
                System.out.println("Invalid choice, please choose between 1 to 5");
            }
        }



        scanner.close();




    }
}
