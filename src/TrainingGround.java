import EnemyRPG.Enemy;
import HeroRPG.Archer;
import HeroRPG.Hero;
import HeroRPG.Mage;
import HeroRPG.Warrior;

public class TrainingGround {
    public static void main(String[] args) {

       Enemy enemy1 = new Enemy("Gad",100);
       Enemy enemy2 = new Enemy("Prizrak",70);

       Warrior warrior = new Warrior("Warrior");
       warrior.attackEnemy(enemy1);

       Mage mage = new Mage("Mage");
       mage.attackEnemy(enemy1);

       Archer archer = new Archer("Archer");
       archer.attackEnemy(enemy2);
    }
}