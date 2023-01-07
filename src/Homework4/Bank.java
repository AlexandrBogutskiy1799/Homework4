package Homework4;

/**
 * You need to following structure: abstarct class Bank and three classes that extends it: USBank, EUBank, ChinaBank. Enum Currency. Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.
 *
 * Finally create Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank. Run four different operations with erery User’s baalance and print its objects to console.
 *
 * TASK 1
 *
 * Abstract class Bank should contain fields
 *
 * long id
 * String bankCountry
 * Currency currency
 * int numberOfEmployees
 * double avrSalaryOfEmployee
 * long rating
 * long totalCapital
 *
 *
 * Generate getters and setters. And create constructor with all fields.
 *
 * Methods are:
 *
 * abstract int getLimitOfWithdrawal()
 * abstract int getLimitOfFunding()
 * abstract int getMonthlyRate()
 * abstract int getCommission(int summ)
 * double moneyPaidMonthlyForSalary()
 */
public abstract class Bank {
}
