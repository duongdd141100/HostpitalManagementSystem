package model;

/**
 *
 */
public class Patient {
    
    private Long id;
    
    private String name;
    
    private String phoneNumber;
    
    private String address;
    
    private Bed bed;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }
    
    

    public Bed getBed() {
        return bed;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    
}
