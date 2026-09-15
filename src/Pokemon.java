public abstract class Pokemon {
    private String name;
    private String type;
    private int health;
    private String move;
    private int damage;

    public Pokemon(String name, String type, String move) {
        this.name = name;
        this.type = type;
        this.move = move;
        this.health = 100;
        this.damage = 20;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getMove() {
        return move;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Pokemon target) {
        System.out.println(name + " setzt " + this.move + " gegen " + target.getName() +
                " ein und verursacht " + damage + " Schaden!");
        //target.health -= this.damage;
        target.setHealth(target.getHealth() - this.damage);
    }

}
