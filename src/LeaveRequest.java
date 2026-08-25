import java.time.LocalDate;

public class LeaveRequest {

    private int requestId;
    private int employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String leaveType;
    private String reason;
    private String status;

    public LeaveRequest(int requestId, int employeeId, LocalDate startDate,
                        LocalDate endDate, String leaveType,
                        String reason) {

        this.requestId = requestId;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leaveType = leaveType;
        this.reason = reason;

        this.status = "Pending & wait for Manager decision";
    }

    public void displayInfo() {
        System.out.println("Request Id: " + requestId);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Leave Type: " + leaveType);
        System.out.println("Reason: " + reason);
        System.out.println("Status: " + status);
        // displayInfo now shows all important request information.
    }
    // requestId identifies this specific leave request.
    public int getRequestId() {
        return requestId;
    }

    public int getEmployeeId() {
        return employeeId;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;

    }


    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;

    }


    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;

    }


    public String getReason() {
        return reason;
    }

public void setReason(String reason){
        this.reason=reason;
}

    public String getStatus() {
        return status;
    }

}