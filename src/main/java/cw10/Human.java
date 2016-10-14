package cw10;

public class Human implements Cloneable {
    private String name;
    private int age;
    private boolean isMarried;
    private Address address;
    static int DIE_COUNT = 0;

    public Human(String name, int age, boolean isMarried, Address address) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.address = address;
    }

    public Human(Human human) {
        this.name = human.getName();
        this.age = human.getAge();
        this.isMarried = human.isMarried();
        this.address = new Address(human.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human died...");
        DIE_COUNT++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (isMarried != human.isMarried) return false;
        if (name != null) {
            if (!name.equals(human.name)) {
                return false;
            }
        } else {
            if (human.name != null) {
                return false;
            }
        }
        if (address != null) {
            return address.equals(human.address);
        } else {
            return human.address == null;
        }
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (isMarried ? 1 : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
