package Q2.com.demo.beans;

import java.time.LocalDate;

public class Server {
    //Defining server variables
    private int sid;
    private String location;
    private int duration;
    private LocalDate purchaseDate;
    private LocalDate endDate;
    private int ram;
    private float price;

    public Server(int sid, String location, int duration, LocalDate purchaseDate, LocalDate endDate, int ram, float price) {
        this.sid = sid;
        this.location = location;
        this.duration = duration;
        this.purchaseDate = purchaseDate;
        this.endDate = endDate;
        this.ram = ram;
        this.price = price;
    }

    //Generating tostring(), to displar output
    @Override
    public String toString() {
        return "Server{" +
                " sid= " + sid +
                ", location= " + location +
                ", days= " + duration +
                ", purchaseDate= " + purchaseDate +
                ", endDate= " + endDate +
                ", ram= " + ram +
                ", price= " + price + '}';
    }
    // Generating getter and setter methods
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
