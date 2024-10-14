package pl.kurs.homework.model;

public class RogueGodHero extends GodHero{
    private double kindnessLevel;

    public RogueGodHero() {
    }

    public RogueGodHero(String name, String powerName, String worldOfOrigin, double kindnessLevel) {
        super(name, powerName, worldOfOrigin);
        this.kindnessLevel = kindnessLevel;
    }

    public double getKindnessLevel() {
        return kindnessLevel;
    }

    public void setKindnessLevel(double kindnessLevel) {
        this.kindnessLevel = kindnessLevel;
    }

    @Override
    public void battlecry() {
        super.battlecry();
        System.out.println("Let's make some noise!!!");
    }

    @Override
    public String toString() {
        return "RogueGodHero{" +
                "name='" + getName() + '\'' +
                ", powerName='" + getPowerName() + '\'' +
                ", worldOfOrigin='" + getWorldOfOrigin() + '\'' +
                ", kindnessLevel=" + kindnessLevel +
                '}';
    }
}
