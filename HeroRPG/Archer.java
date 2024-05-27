package HeroRPG;

import EnemyRPG.Enemy;
import Interfaces.Protection;

public class Archer extends Hero implements Protection{


    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(20);
        System.out.println(getName() + " cтреляет из лука в "+enemy.getNameEnemy()
                +"! " + "здоровье "+enemy.getNameEnemy()+" :"+ enemy.getHealth());
    }

    @Override
    public void shieldProtection() {
        if(getHealth()<90) {
            setHealth(getHealth() + 10);
            System.out.println("Добавлено +10 здоровья " + getName() + "= " + getHealth());
        }
    }
}
