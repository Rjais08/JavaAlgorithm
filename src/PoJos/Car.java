package PoJos;

public class Car {

    Integer id;

    String type;

    String price;

    String company;

    Insurence insurence;

    public Car(Integer id, String type, String company, String price) {
        this.id = id;
        this.type = type;
        this.company = company;
        this.price = price;
        this.insurence = new Insurence(1,"Tata AIA", true, "Term");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Insurence getInsurence() {
        return insurence;
    }

    public void setInsurence(Insurence insurence) {
        this.insurence = insurence;
    }
}
