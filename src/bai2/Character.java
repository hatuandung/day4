package bai2;

public abstract class Character {
    protected String name;
    protected int health;
    protected int dame;

    public Character(String name, int health, int dame) {
        this.name = name;
        this.health = health;
        this.dame = dame;
    }

    public void getInfo(){
        System.out.println("================");
        System.out.println(name + " is instancing!" );
        System.out.println("Health: " + health);
        System.out.println("Dame: " + dame);
    }

//    public void attack(Character character){
//    }

    public void attack(Character character){}
//    public void attack(Monster monster){}
//    public void attack(Hero hero){}
}
