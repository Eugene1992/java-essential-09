package cw03.singleton;

/* Singleton */
public class Connection {
    private String ip;
    private static Connection instance = new Connection("localhost");

    public static Connection getInstance() {
        return instance;
    }

    private Connection(String ip) {
        this.ip = ip;
    }
}
