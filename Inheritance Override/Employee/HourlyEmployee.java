public class HourlyEmployee extends Employee {
    public HourlyEmployee (String lastname,String firstname, String employeeID,
    String dateOfHire, double rateOfPay) {
        super(lastname, firstname, employeeID, dateOfHire, rateOfPay);
    }
    public void displayRateOfPay() {
        System.out.println("You are paid " + this.rateOfPay + " per hour");
   }
}
