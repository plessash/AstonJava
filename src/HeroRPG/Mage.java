package HeroRPG;

import EnemyRPG.Enemy;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int healthResult = enemy.takeDamage(10);
        System.out.println(getName() + " произносит заклинание чтобы убить "
                +enemy.getNameEnemy()+"!"
                + " здоровье "+enemy.getNameEnemy()+" :" + healthResult);

    }
}
