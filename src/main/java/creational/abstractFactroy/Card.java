package creational.abstractFactroy;

import java.util.Date;

public abstract class Card{
    private int points;
    private int number;
    private Date expiryDate;
    protected String type;
    public Card(){
        this.setCardType();
    }

    public String getType() {
        return type;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public abstract String setCardType();

    @Override
    public String toString() {
        return "Card{" +
                "points=" + points +
                ", number=" + number +
                ", expiryDate=" + expiryDate +
                ", type='" + type + '\'' +
                '}';
    }
}
