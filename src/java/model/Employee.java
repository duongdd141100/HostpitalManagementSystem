package model;

import java.util.Date;

/**
 *
 */
public class Employee {
    
    private Long id;
    
    private String name;
    
    private String phoneNumber;
    
    private String address;
    
    private Date joinDate;
    
    private Long roleId;

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

    public Date getJoinDate() {
        return joinDate;
    }

    public Long getRoleId() {
        return roleId;
    }
}
