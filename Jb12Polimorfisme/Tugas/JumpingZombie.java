package Jb12Polimorfisme.Tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += health * 30 / 100;
        } else if (level == 2) {
            health += health * 40 / 100;
        } else if (level == 3) {
            health += health * 50 / 100;
        }
    }

    @Override
    public void destroyed() {
        health = (int) (health * 0.99);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\nHealth = " + health
                + "\nLevel = " + level;
    }
}