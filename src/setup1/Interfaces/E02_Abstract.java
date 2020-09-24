package setup1.Interfaces;

abstract class NoAbstractMethods {
    void f() {
        System.out.println("NoAbstractMethods.f");
    }
}

public class E02_Abstract {
    // 不能创建抽象类的任何实例
    //! new NoAbstractMethods();
}
