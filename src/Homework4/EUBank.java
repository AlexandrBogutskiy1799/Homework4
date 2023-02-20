package Homework4;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD:
                return 2000;
            case EUR:
                return 2200;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        switch (getCurrency()) {
            case USD:
                return 10000;
            case EUR:
                return 20000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {
        switch (getCurrency()) {
            case USD:
                return 0;
            case EUR:
                return 1;
        }
        return 0;
    }

    @Override
    int getCommission(int sum) {
        if ((sum <= 1000) && (getCurrency().equals(Currency.USD))) {
            return 5;
        } else if ((sum > 1000) && (getCurrency().equals(Currency.USD))) {
            return 7;
        }
        if ((sum <= 1000) && (getCurrency().equals(Currency.EUR))) {
            return 2;
        } else if ((sum > 1000) && (getCurrency().equals(Currency.EUR))) {
            return 4;
        }
        return 0;
    }
}
//EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
//limit of funding - 20000 if EUR and 10000 if USD
//monthly rate - 0% with USD and 1% with EUR
//commision - 5% if USD and up to 1000, 7% if USD and more than 1000
//2% if EUR and up to 1000 and 4% if EUR and more than 1000