package setup1.Interfaces.Classprocessor;

import java.util.Arrays;

class Processor {
    public String name() {
        return getClass().getName();
    }

    Object process(Object input) {
        return input;
    }
}

class UpCase extends Processor {
    String process(Object input) {  // Covariant return
        return ((String) input).toUpperCase();
    }
}

class DownCase extends Processor {
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
        // The split() argument divides a String into pieces:
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new UpCase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);
    }
}
