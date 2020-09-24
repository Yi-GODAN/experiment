package setup5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass7 {

    public static void main(String[] args) {
        String[] a = {"A", "B", "C"};
        String[] b = {"D", "E"};

        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));

    }

    //实际上不会因为数组读写而抛出异常
    byte[] getStructureBytes(byte[] data) throws IOException {
        byte[] groupUID = new BigInteger("0123").toByteArray();
        byte[] sn = new BigInteger("456").toByteArray();
        byte[] bodySize = new BigInteger("789").toByteArray();

        //上边三个字节数组用16字节空间+data的大小，以此大小分配缓冲区避免反复分配和复制内存
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16 + data.length);
        byteArrayOutputStream.write(groupUID);
        byteArrayOutputStream.write(sn);
        byteArrayOutputStream.write(bodySize);
        byteArrayOutputStream.write(data);
        //字节数组流的冲刷其实没有用，但是使用流的时候及时冲刷是好习惯
        byteArrayOutputStream.flush();

        return byteArrayOutputStream.toByteArray();
    }
}
