import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    // write code here

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> data = new ArrayList<>();
        data.add(name);
        data.add(String.valueOf(hitPoints));
        data.add(String.valueOf(strength));
        data.add(weapon);
        return data;
    }

    @Override
    public void read(List<String> list) {

    }

    @Override
    public String toString() {
        return "Player{name ='"+ name + "', hitPoints=" + hitPoints + ", strenght=" + strength + ", weapon=" + weapon +
                '}';
    }
}

