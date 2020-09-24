package setup1.Interfaces;

import setup1.polymorphism.Sandwich;

interface FastFood {
    void rushOder();

    void gobble();
}

class FastSandwich extends Sandwich implements FastFood {
    public void rushOder() {
        System.out.println("Rushing your sandwich order");
    }

    public void gobble() {
        System.out.println("Chomp! Snort! Gobble!");
    }
}

public class E08_FastFood {
    public static void main(String[] args) {
        FastSandwich fs = new FastSandwich();
        System.out.println("Fries with what?");
        System.out.println("Super size");
        fs.rushOder();
        fs.gobble();
    }
}
