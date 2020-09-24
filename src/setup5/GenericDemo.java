package setup5;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(234);

        getData(name);
        getData(age);
        getData(number);

//        getUperNumber(name);  //ERROR：此方法中的参数已经限定了参数泛型上限为Number,泛型String不在范围之内。
        getUperNumber(age);
        getUperNumber(number);
    }

    public static void getData(List<?> data) {
        System.out.println("data: " + data.get(0));
    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data: " + data.get(0));
    }
}
