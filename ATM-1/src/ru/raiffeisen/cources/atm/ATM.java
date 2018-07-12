package ru.raiffeisen.cources.atm;

import ru.raiffeisen.cources.atm.model.constants.CurrencyHolder;
import ru.raiffeisen.cources.atm.model.money.Money;
import ru.raiffeisen.cources.atm.model.score.CreditScore;
import ru.raiffeisen.cources.atm.model.score.CurrentScore;
import ru.raiffeisen.cources.atm.model.score.DebetScore;
import ru.raiffeisen.cources.atm.model.score.Score;

public class ATM {
    private CurrentScore currentScore;
    private DebetScore debetScore;
    private CreditScore creditScore;

    public ATM() {
        this.creditScore =
                new CreditScore(
                        new Money(1000.0d,
                                  CurrencyHolder.getCurrencyByName("RUR").getName()
                                 ), null, 1);
        this.debetScore =
                new DebetScore(
                        new Money(1000.0d,
                                CurrencyHolder.getCurrencyByName("RUR").getName()
                        ), null, 1, this.creditScore);
        this.currentScore =
                new CurrentScore(
                        new Money(1000.0d,
                                CurrencyHolder.getCurrencyByName("RUR").getName()
                        ), null, 1, this.debetScore);
    }

    public CurrentScore getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(CurrentScore currentScore) {
        this.currentScore = currentScore;
    }

    public DebetScore getDebetScore() {
        return debetScore;
    }

    public void setDebetScore(DebetScore debetScore) {
        this.debetScore = debetScore;
    }

    public CreditScore getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(CreditScore creditScore) {
        this.creditScore = creditScore;
    }
}
