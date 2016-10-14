package cw10;

public class Address {
    private String country;

    public Address(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return country != null ? country.equals(address.country) : address.country == null;

    }

    @Override
    public int hashCode() {
        return country != null ? country.hashCode() : 0;
    }
}
