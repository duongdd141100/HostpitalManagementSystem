package model;

/**
 *
 */
public class Patient {
    
    private Long id;
    
    private String name;
    
    private String phoneNumber;
    
    private String address;
    
    private Long bedId;

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

    public Long getBedId() {
        return bedId;
    }
}
