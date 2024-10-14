package pl.kurs.homework.app;

import pl.kurs.homework.model.GodHero;
import pl.kurs.homework.model.HumanHero;
import pl.kurs.homework.model.RogueGodHero;

public class HeroRunner {
    public static void main(String[] args) {
        HumanHero deadpool = new HumanHero("Deadpool","nieśmiertelność",100.0);
        System.out.println(deadpool);

        deadpool.battlecry();
        System.out.println();

        GodHero thor = new GodHero("Thor","magiczny młot","Asgard");
        System.out.println(thor);

        thor.battlecry();
        System.out.println();

        RogueGodHero loki = new RogueGodHero("Loki","mistrz kłamstwa","Asgard",0.0);
        System.out.println(loki);

        loki.battlecry();
        System.out.println();

    }
}
