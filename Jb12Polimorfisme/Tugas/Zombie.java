package Jb12Polimorfisme.Tugas;

public class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        // Implementasi penyembuhan pada subclass
    }

    @Override
    public void destroyed() {
        // Implementasi penghancuran pada subclass
    }

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}
