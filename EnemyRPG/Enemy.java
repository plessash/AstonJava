package EnemyRPG;

import HeroRPG.Hero;

public abstract class Enemy {
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

    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void attackHero(Hero hero);

}
