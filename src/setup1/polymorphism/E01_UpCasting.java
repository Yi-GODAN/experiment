package setup1.polymorphism;

class Cycle {
    private int wheels;

    public void ride() {
        System.out.println("Run cycle");
    }

    public int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    public void ride() {
        System.out.println("Run Unicycle");
    }

    public int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    public void ride() {
        System.out.println("Run Bicycle");
    }

    public int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    public void ride() {
        System.out.println("Run tricycle");
    }

    public int wheels() {
        return 3;
    }
}

public class E01_UpCasting {
    public static void upCasting(Cycle cycle) {
        cycle.ride();
    }

    public static void ride(Cycle cycle) {
        System.out.println("Num. of wheels: " + cycle.wheels());
    }

    public static void main(String[] args) {
        upCasting(new Cycle());     // No up casting
        upCasting(new Unicycle());  // UpCasting
        upCasting(new Bicycle());   // UpCasting
        upCasting(new Tricycle());  // UpCasting

        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
