import EnemyRPG.Enemy;
import EnemyRPG.Vandal;
import EnemyRPG.Zombie;
import HeroRPG.Archer;
import HeroRPG.Mage;
import HeroRPG.Warrior;

public class Main {
    public static void main(String[] args) {

        Zombie zombie1 = new Zombie("Zigzag", 100);

        Warrior warrior = new Warrior("Warrior", 100);
        warrior.attackEnemy(zombie1);

        Mage mage = new Mage("Mage", 100);
        mage.attackEnemy(zombie1);

        warrior.attackEnemy(zombie1);

        Enemy zombie = new Zombie("Zorg", 100);

        warrior.attackEnemy(zombie);
        zombie.takeDamage(20);
        zombie.attackHero(warrior);
        zombie.attackHero(warrior);
        zombie.attackHero(warrior);
        warrior.attackEnemy(zombie);

        Enemy vandal = new Vandal("Vandal", 100);
        vandal.attackHero(mage);

        Vandal vandal1 = new Vandal("Idol", 100);
        vandal1.burnTheHero(warrior);

        Archer archer = new Archer("Archer", 100);
        archer.attackEnemy(vandal);
        vandal.attackHero(archer);
        archer.shieldProtection();
    }
}