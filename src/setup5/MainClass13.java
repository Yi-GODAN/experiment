package setup5;

import java.util.ArrayList;

public class MainClass13 {

    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "not common");
        objArray2.add(3, "not common1");
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        System.out.println("ObjArray 的数组元素: " + objArray);
        System.out.println("ObjArray2 的数组元素：" + objArray2);
        System.out.println("ObjArray 是否包含字符串 common2?："
                + objArray.contains("common2"));
        System.out.println("ObjArray2 是否包含数组 ObjArray?："
                + objArray2.contains(objArray));
    }
}
