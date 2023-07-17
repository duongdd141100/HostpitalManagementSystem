package model;

import java.util.ArrayList;

/**
 *
 */
public class Room {
    
    private Long id;
    
    private String name;
    
    private Integer floor;
    
    private ArrayList<Bed> beds;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getFloor() {
        return floor;
    }

    public ArrayList<Bed> getBeds() {
        return beds;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public void setBeds(ArrayList<Bed> beds) {
        this.beds = beds;
    }
    
}
