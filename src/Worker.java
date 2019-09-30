public class Worker extends Person{

    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) throws Exception {
        if (hoursWorked < 0) {
            throw new Exception("Hours worked must be greater than 0.");
        }
        else if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        }
        else {
            return hourlyPayRate * 40 + ((hoursWorked - 40) * hourlyPayRate * 1.5);
        }
    }

    public String displayWeeklyPay(double hoursWorked) throws Exception {
        if (hoursWorked < 0) {
            throw new Exception("Hours worked must be greater than 0.");
        }
        else {
            double underPay;
            if (hoursWorked <= 40){
                underPay = hoursWorked * hourlyPayRate;
                return "Hours worked at regular rate: " + hoursWorked + " and they are getting " + underPay + "\nTotal: " + underPay + "\n";
            }
            else{
                underPay = hourlyPayRate * 40;
                double overPay = (hoursWorked - 40) * hourlyPayRate *  1.5;
                return "Hours worked at regular rate: 40.0 and they are getting " + underPay +
                        "\nHours worked at overtime rate: " + (hoursWorked - 40) + " and they are getting " + overPay +
                        "\nTotal: " + (underPay + overPay) + "\n";
            }
        }
    }
}
