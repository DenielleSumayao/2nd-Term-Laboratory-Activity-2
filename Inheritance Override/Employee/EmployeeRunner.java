public class EmployeeRunner {
    public static void main(String[] args){
        Employee e1 = new Employee ("Sumayao", "Nielle", "192834", "October 15, 2017", 5000);
        HourlyEmployee e2 = new HourlyEmployee ("Allado", "Abi", "230451", "July 17, 2019", 4000);
        ContractEmployee e3 = new ContractEmployee ("Alejaga", "Charlie", "290344", "August 12, 2018", 3780);
        
        e1.displayRateOfPay();
        e2.displayRateOfPay();
        e3.displayRateOfPay();
    }
}
