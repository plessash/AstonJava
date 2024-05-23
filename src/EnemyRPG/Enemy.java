package EnemyRPG;

public class Enemy implements Mortal {
    private String nameEnemy;

    public String getNameEnemy() {
        return nameEnemy;
    }

    public Enemy(String nameEnemy, int health) {
        this.nameEnemy = nameEnemy;
        this.health = health;
    }

    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Enemy(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        int resultHealth;
        resultHealth = health - damage;
        health = resultHealth;
        return health;
    }

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        return false;
    }
}
