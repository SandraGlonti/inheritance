package pl.kurs.homework.model;

public class Hero {
    private String name;
    private String powerName;

    public Hero() {
    }

    public Hero(String name, String powerName) {
        this.name = name;
        this.powerName = powerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public void battlecry(){
        System.out.println("To the battle!!!");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", powerName='" + powerName + '\'' +
                '}';
    }
}
