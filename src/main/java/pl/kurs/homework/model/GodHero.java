package pl.kurs.homework.model;

public class GodHero extends Hero{
    private String worldOfOrigin;

    public GodHero() {
    }

    public GodHero(String name, String powerName, String worldOfOrigin) {
        super(name, powerName);
        this.worldOfOrigin = worldOfOrigin;
    }

    public String getWorldOfOrigin() {
        return worldOfOrigin;
    }

    public void setWorldOfOrigin(String worldOfOrigin) {
        this.worldOfOrigin = worldOfOrigin;
    }

    @Override
    public void battlecry() {
        super.battlecry();
        System.out.println("May the force be with us!!!");
    }

    @Override
    public String toString() {
        return "GodHero{" +
                "name='" + getName() + '\'' +
                ", powerName='" + getPowerName() + '\'' +
                ", worldOfOrigin='" + worldOfOrigin + '\'' +
                '}';
    }
}
