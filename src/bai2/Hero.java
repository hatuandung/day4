package bai2;

public class Hero extends Character {
    Monster monster;
    public Hero(String name, int health, int dame) {
        super(name, health, dame);
    }

    public void attack(Monster monster) {
        System.out.println(name + " is attacking !!");
        monster.health = monster.health - dame;
        if (monster.health < 0) monster.health = 0;
        System.out.println(monster.name + " Health " + monster.health);
        System.out.println("*******");
    }

}
