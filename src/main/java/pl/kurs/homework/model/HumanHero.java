package pl.kurs.homework.model;

public class HumanHero extends Hero{
    private double damageResistance;

    public HumanHero() {
    }

    public HumanHero(String name, String powerName, double damageResistance) {
        super(name, powerName);
        this.damageResistance = damageResistance;
    }

    public double getDamageResistance() {
        return damageResistance;
    }

    public void setDamageResistance(double damageResistance) {
        this.damageResistance = damageResistance;
    }

    @Override
    public void battlecry() {
        super.battlecry();
        System.out.println("All Human Heros together!!!");
    }

    @Override
    public String toString() {
        return "HumanHero{" +
                "name='" + getName() + '\'' +
                ", powerName='" + getPowerName() + '\'' +
                ", damageResistance=" + damageResistance +
                '}';
    }
}
