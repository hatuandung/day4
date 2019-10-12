package bai2;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero", 1000, 300);
        Monster monster = new Monster("Monster", 2000, 270);
        hero.getInfo();
        monster.getInfo();

        playGame(hero, monster);
    }

    public static void playGame(Hero hero, Monster monster) {
        System.out.println("The game is starting! Are you ready?");
        while (hero.health > 0 || monster.health > 0) {

            //monster
            monster.attack(hero);
            if (hero.health <= 0) {
                System.out.println("Monster win");
                break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //hero
            hero.attack(monster);
            if (monster.health <= 0) {
                System.out.println("Hero win");
                break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
