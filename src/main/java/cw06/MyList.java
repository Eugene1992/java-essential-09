package cw06;

/**
 * Created by evgeniy on 10/10/16.
 */
public class MyList {
    private String value;
    private MyList prev;
    private MyList next;

    public MyList(String value) {
        this.value = value;
        this.prev = this;
        this.next = this;
    }

    public MyList getPrev() {
        return prev;
    }

    public MyList getNext() {
        return next;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyList myList = new MyList("Hello world!");
        System.out.println(myList.getNext().getValue());
    }
}
