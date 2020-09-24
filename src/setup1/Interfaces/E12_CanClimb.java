package setup1.Interfaces;

interface CanClimb {
    void climb();
}

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {
    public void swim() {
    }

    public void fly() {
    }

    public void climb() {
    }
}

public class E12_CanClimb {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void c(CanClimb x) {
        x.climb();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);   // Treat it as a CanFight
        u(h);   // Treat it as a CanSwim
        v(h);   // Treat it as a CanFlt
        c(h);   // Treat it as a CanClimb
        w(h);   // Treat it as a ActionCharacter
    }
}
