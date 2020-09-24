package setup1.innerclasses.exercise6b;

import setup1.innerclasses.exercise6.SimpleInterface;

public class SimpleClass {
    protected class Inner implements SimpleInterface {
        //Force constructor to be public
        public Inner() {
        }

        public void f() {
        }
    }
}
