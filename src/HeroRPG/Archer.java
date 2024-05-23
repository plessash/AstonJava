package HeroRPG;

import EnemyRPG.Enemy;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int healthResult = enemy.takeDamage(45);
        System.out.println(getName() + " cтреляет из лука в "+enemy.getNameEnemy()
                +"! " + "здоровье "+enemy.getNameEnemy()+" :"+ healthResult);
    }
}
