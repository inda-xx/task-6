public class Enemy extends Entity {
    public Enemy() {
        super();
    }

    public boolean interactPlayer(Player player) {
        if (this.x == player.x && this.y == player.y) {
            return true; // Enemy is removed
        }
        return false;
    }
}