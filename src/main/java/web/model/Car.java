package web.model;

public class Car {
    private int id;
    private String model;
    private String owner;

    public Car(int id, String model, String owner) {
        this.id = id;
        this.model = model;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
