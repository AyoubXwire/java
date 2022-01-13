public class Dragon extends Ennemy {
    int power;

    Dragon(int power) {
        this.power = power;
    }

    void attack() {
        System.out.println("Fire attack");
    }
}
