package br.com.petShop.model;


public class ToDo {
    private int id;
    private String date;
    private String time;
    private String status;
    private double total_Value;

    private Services services;
    private Customers custumers;
    private Pets pets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal_Value() {
        return total_Value;
    }

    public void setTotal_Value(double total_Value) {
        this.total_Value = total_Value;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Customers getCustumers() {
        return custumers;
    }

    public void setCustumers(Customers custumers) {
        this.custumers = custumers;
    }

    public Pets getPets() {
        return pets;
    }

    public void setPets(Pets pets) {
        this.pets = pets;
    }
}
