public class Employee {
    String lastname;
    String firstname;
    String employeeID;
    String dateOfHire;
    double rateOfPay;
    public Employee(String lastname,String firstname, String employeeID,
    String dateOfHire,double rateOfPay) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.employeeID = employeeID;
        this.dateOfHire = dateOfHire;
        this.rateOfPay = rateOfPay;
    }
    
    public void work() {
        System.out.println("Working...");
    }
    public void displayRateOfPay() {
        System.out.println("You are paid " + this.rateOfPay + " per month");
    }
}
