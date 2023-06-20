package org.example;

public class PhonePeStrategy implements PaymentStrategy{
    private String upiID;

    public PhonePeStrategy(String upiID) {
        this.upiID = upiID;
    }

    public String getUpiID() {
        return upiID;
    }

    public void setUpiID(String upiID) {
        this.upiID = upiID;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("amount paid :"+amount);
    }
}
