package model;

/**
 *
 */
public class Bed {
    
    private Long id;
    
    private String name;
    
    private Double price;
    
    private Room room;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
    

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Room getRoom() {
        return room;
    }
}
