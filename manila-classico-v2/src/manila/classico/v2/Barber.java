package manila.classico.v2;

public class Barber {
    private String name;
    private String contact;
    private String email;
    private java.util.Date dateJoined;

    public Barber(String name, 
                  String contact, 
                  String email, 
                  java.util.Date dateJoined) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.dateJoined = dateJoined;
    }

    public String getName() { 
        return name; 
    }
    
    public String getContact() { 
        return contact; 
    }
    
    public String getEmail() { 
        return email; 
    }
    
    public java.util.Date getDateJoined() { 
        return dateJoined; 
    }

    public void setName(String name) { 
        this.name = name; 
    }
    
    public void setContact(String contact) { 
        this.contact = contact; 
    }
    
    public void setEmail(String email) { 
        this.email = email; 
    }
    
    public void setDateJoined(java.util.Date dateJoined) { 
        this.dateJoined = dateJoined; 
    }
}