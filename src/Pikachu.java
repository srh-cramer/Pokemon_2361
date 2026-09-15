public class Pikachu extends Pokemon implements Evolvable {

    public Pikachu(String name) {
        super(name, "Elektro", "Donnerschock");
        this.setDamage(30);
    }

    @Override
    public void evolve(){
        System.out.println("Hey, " + this.getName() + " entwickelt sich!");
    }

}
