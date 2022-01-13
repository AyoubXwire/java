public class EnnemyFactory {

    public static EnnemyFactory instance = null;

    private EnnemyFactory() {}

    public static EnnemyFactory getInstance() {
        if (instance == null) {
            instance = new EnnemyFactory();
        }

        return instance;
    }

    public Ennemy getEnnemy(int power) {
        if (power > 0 && power < 100) {
            return new Human(power);
        } else if (power >= 100 && power < 500) {
            return new Ogre(power);
        } else if (power > 500) {
            return new Dragon(power);
        } else {
            return null;
        }
    }
}
