package com.zubrycky.lesson.lesson_15_generic;

public class Para<Typ1, Typ2> {
    private final Typ1 typ1;
    private final Typ2 typ2;

    public Para(Typ1 typ1, Typ2 typ2) {
        this.typ1 = typ1;
        this.typ2 = typ2;
    }

    public Typ1 getTyp1() {
        return typ1;
    }

    public Typ2 getTyp2() {
        return typ2;
    }
}
