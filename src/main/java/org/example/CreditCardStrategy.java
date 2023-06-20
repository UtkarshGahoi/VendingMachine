package org.example;

public class CreditCardStrategy implements PaymentStrategy{

    private String cardNumber;
    private String expDate;
    private String cvv;

    public CreditCardStrategy(String cardNumber, String expDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("Paid amont :"+amount);
    }
}
