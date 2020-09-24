package setup1.Interfaces;

import setup1.Interfaces.wonpackage.Rodent;

class Mouse2 implements Rodent {
    @Override
    public void hop() {
        System.out.println("Mouse hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Mouse scurry");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Mice");
    }

    public String toString() {
        return "Mouse";
    }
}

class Gerbil2 implements Rodent {
    @Override
    public void hop() {
        System.out.println("Gerbil hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Gerbil scurry");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Gerbil");
    }

    public String toString() {
        return "GerBil";
    }
}

class Hamster2 implements Rodent {
    @Override
    public void hop() {
        System.out.println("Hamster hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Hamster scurry");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Hamster");
    }

    public String toString() {
        return "Hamster";
    }
}

public class E07_InterfaceRodent {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse2(),
                new Gerbil2(),
                new Hamster2()
        };

        for (Rodent rodent : rodents) {
            rodent.hop();
            rodent.scurry();
            rodent.reproduce();
            System.out.println(rodent);
        }
    }
}
