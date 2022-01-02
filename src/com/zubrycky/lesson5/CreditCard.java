package com.zubrycky.lesson5;

import java.util.Objects;

public class CreditCard {
    private Long number;
    private CardStatus status;

    public CreditCard(Long number, CardStatus status) {
        this.number = number;
        this.status = status;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public CardStatus getStatus() {
        return status;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Objects.equals(number, that.number) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, status);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                ", status=" + status +
                '}';
    }
}
