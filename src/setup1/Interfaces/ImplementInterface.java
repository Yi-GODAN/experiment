package setup1.Interfaces;

import setup1.Interfaces.wonpackage.AnInterface;

public class ImplementInterface implements AnInterface {
    @Override
    public void f() {
        System.out.println("ImplementInterface.f");
    }

    @Override
    public void g() {
        System.out.println("ImplementInterface.g");
    }

    @Override
    public void h() {
        System.out.println("ImplementInterface.h");
    }
}
