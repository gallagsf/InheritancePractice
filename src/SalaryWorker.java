public class SalaryWorker extends Worker{

    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) throws ExceptionInInitializerError{
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    private void validateHourlyPayRate(double hourlyPayRate) throws ExceptionInInitializerError {
        if (annualSalary < 0){
            throw new ExceptionInInitializerError("annualSalary can not be less than 0.");
        }
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) throws Exception {
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) throws Exception {
        return super.displayWeeklyPay(hoursWorked) + "This weeks pay is " + (super.calculateWeeklyPay(hoursWorked) / annualSalary) + "% of annual salary.\n";
    }
}
