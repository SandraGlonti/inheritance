package pl.kurs.model.child;

import pl.kurs.model.parent.Parent;

public class Child extends Parent {

    public Child(){
        this.firstName = "Michał";
        this.lastName = "Nowak";
        //this.age - pole package-private, dlatego w klasie podrzednej nie ma dostepu
    }

}
