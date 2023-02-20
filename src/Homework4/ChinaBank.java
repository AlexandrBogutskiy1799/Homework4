package Homework4;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD:
                return 100;
            case EUR:
                return 150;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        switch (getCurrency()) {
            case USD:
                return 1000;
            case EUR:
                return 5000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {
        switch (getCurrency()) {
            case USD:
                return 1;
            case EUR:
                return 0;
        }
        return 0;
    }

    @Override
    int getCommission(int sum) {
        if ((sum <= 1000) && (getCurrency().equals(Currency.USD))) {
            return 3;
        } else if ((sum > 1000) && (getCurrency().equals(Currency.USD))) {
            return 5;
        }
        if ((sum <= 1000) && (getCurrency().equals(Currency.EUR))) {
            return 10;
        } else if ((sum > 1000) && (getCurrency().equals(Currency.EUR))) {
            return 11;
        }
        return 0;
    }
}
//ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
//
//limit of funding - 5000 if EUR and 10000 if USD
//monthly rate - 1% with USD and 0% with EUR
//commision - 3% if USD and up to 1000, 5% if USD and more than 1000
//10% if EUR and up to 1000 and 11% if EUR and more than 1000