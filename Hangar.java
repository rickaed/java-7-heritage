public class Hangar {
    public static void main(String... args) {
        Car voiture = new Car("Clio",0);
        Boat bateau = new Boat("Titanic", 0);
    System.out.println(voiture.doStuff());
    System.out.println(bateau.doStuff());
    }
}