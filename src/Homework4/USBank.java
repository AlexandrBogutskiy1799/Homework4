package Homework4;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                  long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD:
                return 1000;
            case EUR:
                return 1200;
        }
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        switch (getCurrency()) {
            case USD:
                return 0;
            case EUR:
                return 10000;
        }
        return 0;
    }

    @Override
    int getMonthlyRate() {
        switch (getCurrency()) {
            case USD:
                return 1;
            case EUR:
                return 2;
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
            return 6;
        } else if ((sum > 1000) && (getCurrency().equals(Currency.EUR))) {
            return 8;
        }


        return 0;
    }

    //USBank: лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
    //лимит пополнения - 10000, если EUR, и нет лимита, если USD
    //месячная ставка - 1% на USD и 2% на EUR
    //комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
    //6%, если EUR и до 1000 и 8%, если EUR и больше 1000
}
