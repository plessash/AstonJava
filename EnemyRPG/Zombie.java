package EnemyRPG;

import HeroRPG.Hero;
import Interfaces.Mortal;

public class Zombie extends Enemy implements Mortal {
    public Zombie(int health) {
        super(health);
    }

    public Zombie(String nameEnemy, int health) {
        super(nameEnemy, health);
    }

    @Override
    public void attackHero(Hero hero) {
            hero.takeDamageEnemy(25);
        if(hero.getHealth()>1){
            System.out.println(getNameEnemy() + " аттакует в ответ " + hero.getName()
                    + "! " + "здоровье " + hero.getName() + " :" + hero.getHealth());
        }else {
            System.out.println(hero.getName()+" Убит!");
        }
    }
    @Override
    public boolean isAlive() {
        int helth = getHealth();
        if (helth < 0) {
            return true;
        }
        return false;
    }

    }

