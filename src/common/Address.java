package common;

public class Address {
    private String address1;
    private String address2;
    private String city;
    private String phone;
    private String email;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.address1 != null ? this.address1.hashCode() : 0);
        hash = 83 * hash + (this.address2 != null ? this.address2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if ((this.address1 == null) ? (other.address1 != null) : !this.address1.equals(other.address1)) {
            return false;
        }
        if ((this.address2 == null) ? (other.address2 != null) : !this.address2.equals(other.address2)) {
            return false;
        }
        return true;
    }

    

    

}
