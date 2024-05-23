package HeroRPG;

import EnemyRPG.Enemy;

public class Warrior extends Hero{

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int healthResult = enemy.takeDamage(50);
        System.out.println(getName()+" аттакует "+enemy.getNameEnemy()+"!"
                                    +" здоровье "+enemy.getNameEnemy()+
                " :"+healthResult);
    }

}

