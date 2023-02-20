package Homework4;

/**
 * You need to following structure: abstarct class Bank and three classes that extends it: USBank, EUBank, ChinaBank. Enum Currency. Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.
 * <p>
 * Finally create Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank. Run four different operations with erery User’s baalance and print its objects to console.
 * <p>
 * TASK 1
 * <p>
 * Abstract class Bank should contain fields
 * <p>
 * long id
 * String bankCountry
 * Currency currency
 * int numberOfEmployees
 * double avrSalaryOfEmployee
 * long rating
 * long totalCapital
 * <p>
 * <p>
 * Generate getters and setters. And create constructor with all fields.
 * <p>
 * Methods are:
 * <p>
 * abstract int getLimitOfWithdrawal()
 * abstract int getLimitOfFunding()
 * abstract int getMonthlyRate()
 * abstract int getCommission(int summ)
 * double moneyPaidMonthlyForSalary()
 */
public abstract class Bank {

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    abstract int getCommission(int sum);

    double moneyPaidMonthlyForSalary() {
        return 0;
    }


}
