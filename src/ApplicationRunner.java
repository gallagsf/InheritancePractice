public class ApplicationRunner {
    public static void main(String[] args) {

        Worker employee1 = new Worker("1", "John", "Doe", "Mr.", 1978, 35);
        Worker employee2 = new Worker("2", "Dean", "Lincoln", "Mr.", 1988, 45);
        Worker employee3 = new Worker("3", "Thomas", "Anderson", "Mr.", 1997, 30);

        SalaryWorker employee4 = new SalaryWorker("4", "Gee-Wei", "Wang", "Mr.", 1998, 40, 83200);
        SalaryWorker employee5 = new SalaryWorker("5", "Grenn", "Hollard", "Mr.", 1958, 50, 104000);
        SalaryWorker employee6 = new SalaryWorker("6", "Annja", "Gormundsdottir", "Mrs.", 1996, 55, 114400);

        try{
            double weekHours;
            for (int i = 1; i <= 3; ++i){
                if (i == 2){
                    weekHours = 50;
                }
                else{
                    weekHours = 40;
                }
                System.out.println("Week " + i + "\n=======================");
                System.out.println(employee1.formalName() + " ID#: " + employee1.getID() + "\n" + employee1.displayWeeklyPay(weekHours) + "\n");
                System.out.println(employee2.formalName() + " ID#: " + employee2.getID() + "\n" + employee2.displayWeeklyPay(weekHours) + "\n");
                System.out.println(employee3.formalName() + " ID#: " + employee3.getID() + "\n" + employee3.displayWeeklyPay(weekHours) + "\n");
                System.out.println(employee4.formalName() + " ID#: " + employee4.getID() + "\n" + employee4.displayWeeklyPay(weekHours) + "\n");
                System.out.println(employee5.formalName() + " ID#: " + employee5.getID() + "\n" + employee5.displayWeeklyPay(weekHours) + "\n");
                System.out.println(employee6.formalName() + " ID#: " + employee6.getID() + "\n" + employee6.displayWeeklyPay(weekHours) + "\n");
            }
        }
        catch (Exception ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
