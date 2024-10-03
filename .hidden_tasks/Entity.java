import java.util.Random;

public class Entity {
    protected int x, y;

    public Entity() {
        x = 0;
        y = 0;
    }

    public void move(Random random) {
        x += random.nextBoolean() ? 1 : -1;
        y += random.nextBoolean() ? 1 : -1;
    }
}