package HeroRPG;

import EnemyRPG.Enemy;

public class Mage extends Hero {


    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
        System.out.println(getName() + " произносит заклинание чтобы убить "
                +enemy.getNameEnemy()+"!"
                + " здоровье "+enemy.getNameEnemy()+" :" + enemy.getHealth());

    }

}
