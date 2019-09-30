public class ApplicationRunner {
    public static void main(String[] args) {
        Worker test = new Worker("1", "John", "Doe", "Mr.", 1994, 30);

        try{
            System.out.println(test.displayWeeklyPay(25));
            System.out.println(test.calculateWeeklyPay(25));

            System.out.println(test.displayWeeklyPay(50));
            System.out.println(test.calculateWeeklyPay(50));

            System.out.println(test.displayWeeklyPay(40));
            System.out.println(test.calculateWeeklyPay(40));


            System.out.println(test.displayWeeklyPay(-5));
        }
        catch (Exception ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
