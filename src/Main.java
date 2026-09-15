public class Main {
    public static void main(String[] args) {
        //Pokemon herbert = new Pokemon("Herbert", "Pflanze", "Handkantenschlag");
        //Pokemon susanne = new Pokemon("Susanne", "Eis", "Gefrierfach-Attacke");
        //herbert.attack(susanne);
        //System.out.println("Susannes Health: " + susanne.getHealth());

        Pikachu pika = new Pikachu("Pika");
        Pikachu schocki = new Pikachu("Schocki");
        pika.attack(schocki);
        System.out.println("Susannes Health: " + schocki.getHealth());
        pika.evolve();

    }
}
