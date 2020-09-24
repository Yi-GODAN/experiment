package setup1.innerclasses;

class Sequence2 {
    private Object[] items;
    private int next = 0;

    public Sequence2(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class ReverseSelector implements Selector {
        private int i = items.length - 1;

        public boolean end() {
            return i < 0;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i >= 0) i--;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector reverseSelector() {
        return new ReverseSelector();
    }

    public Selector sequenceSelector() {
        return new SequenceSelector();
    }
}

public class E22_GetSelector {
    public static void main(String[] args) {
        Sequence2 sequence2 = new Sequence2(10);
        for (int i = 0; i < 10; i++)
            sequence2.add(Integer.toString(i));
        Selector seqSelector = sequence2.sequenceSelector();
        while (!seqSelector.end()) {
            System.out.print(seqSelector.current() + " ");
            seqSelector.next();
        }
        Selector revSelector = sequence2.reverseSelector();
        while (!revSelector.end()) {
            System.out.print(revSelector.current() + " ");
            revSelector.next();
        }
    }
}
