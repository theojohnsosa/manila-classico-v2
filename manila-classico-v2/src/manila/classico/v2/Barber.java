package manila.classico.v2;

public class Barber {
    private String barberName;
    private String barberContact;
    private String barberEmail;
    private java.util.Date dateJoined;

    public Barber(String barberName, String barberContact, String barberEmail, java.util.Date dateJoined) {
        this.barberName = barberName;
        this.barberContact = barberContact;
        this.barberEmail = barberEmail;
        this.dateJoined = dateJoined;
    }

    public String getName() { 
        return barberName; 
    }
    
    public String getContact() { 
        return barberContact; 
    }
    
    public String getEmail() { 
        return barberEmail; 
    }
    
    public java.util.Date getDateJoined() { 
        return dateJoined; 
    }

    public void setName(String barberName) { 
        this.barberName = barberName; 
    }
    
    public void setContact(String barberContact) { 
        this.barberContact = barberContact; 
    }
    
    public void setEmail(String barberEmail) { 
        this.barberEmail = barberEmail; 
    }
    
    public void setDateJoined(java.util.Date dateJoined) { 
        this.dateJoined = dateJoined; 
    }
}