package HeroRPG;

import EnemyRPG.Enemy;
import Interfaces.Mortal;
import Interfaces.Protection;

public abstract class Hero {
    private String name;
    private int health;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamageEnemy(int damage){
        health -=damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void setHealth(int health) {
        this.health = health;
    }
}
