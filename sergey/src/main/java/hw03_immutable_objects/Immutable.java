package hw03_immutable_objects;

/**
 * Created by Serezha on 05.10.2016.
 */
public final class Immutable {
    private final int x;
    private final int y;
    private final String text;

    public Immutable(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }
}