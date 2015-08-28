/**
 * Created by Thomas on 8/22/2015.
 */
public class Executive extends Employee{

    private double currentStockPrice;

    /*
            Constructors
     */

    public Executive() {

    }

    public Executive(int year, String name, double monthlySalary, double currentStockPrice) {
        super(year, name, monthlySalary);
        this.currentStockPrice = currentStockPrice;
    }

    /*
            Functions
     */

    @Override
    public double annualSalary() {
        double bonus = 0;

        // The bonus is $30,000 if the current stock price is greater than $50 and nothing otherwise.
        if (this.currentStockPrice > 50) {
            bonus = 30000;
        }

        return super.annualSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurrent Stock Price: " + currentStockPrice;
    }

    /*
            Getters and Setters
     */

    public double getCurrentStockPrice() {
        return currentStockPrice;
    }

    public void setCurrentStockPrice(double currentStockPrice) {
        this.currentStockPrice = currentStockPrice;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getMonthlySalary() {
        return super.getMonthlySalary();
    }

    @Override
    public void setMonthlySalary(double monthlySalary) {
        super.setMonthlySalary(monthlySalary);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }
}
