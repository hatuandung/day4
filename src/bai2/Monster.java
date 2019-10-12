package bai2;

public class Monster extends Character {
    Hero hero;
    public Monster(String name, int health, int dame) {
        super(name, health, dame);
    }

    public void attack(Hero hero) {
        System.out.println(name + " is attacking !!");
        hero.health = hero.health - dame;
        if (hero.health < 0) hero.health = 0;
        System.out.println(hero.name + " Health " + hero.health);
        System.out.println("************");
    }
}
