package HeroRPG;
import EnemyRPG.Enemy;
import Interfaces.Protection;
public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(50);
        if (enemy.getHealth() > 1) {
            System.out.println(getName() + " аттакует " + enemy.getNameEnemy() + "!"
                    + " здоровье " + enemy.getNameEnemy() +
                    " :" + enemy.getHealth());
        } else {
            System.out.println(getName() + " аттакует " + enemy.getNameEnemy() + " Он убит!");
        }
    }
}



