package cw08;

public enum Country {
    UKRAINE("Ukraine"),
    RUSSIA("Russia"),
    USA("United states of Anerica");

    String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
