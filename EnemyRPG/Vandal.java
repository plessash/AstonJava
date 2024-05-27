package EnemyRPG;

import HeroRPG.Hero;
import Interfaces.Fire;

public class Vandal extends Enemy implements Fire {
    public Vandal(String nameEnemy, int health) {
        super(nameEnemy, health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamageEnemy(30);
        if (hero.getHealth() > 1) {
            System.out.println(getNameEnemy() + " аттакует в ответ " + hero.getName()
                    + "! " + "здоровье " + hero.getName() + " :" + hero.getHealth());
        } else {
            System.out.println(hero.getName() + " Убит!");
        }
    }

    @Override
    public void burnTheHero(Hero hero) {
        int resultHealth = hero.getHealth();
        resultHealth = 0;
        System.out.println(getNameEnemy()+" стреляет огнем в "+ hero.getName() +" - он уничтожен");
    }
}
