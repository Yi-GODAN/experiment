package setup6.LambdaCalculus.Stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/03 00:18
 */
public class StreamReduce {

    public static void main(String[] args) {
        List<String> props = List.of(
                "profile=native", "debug=true",
                "logging=warn", "interval=500");
        Map<String, String> map = props.stream()
                //把k=v转换为Map[k]=v:
                .map(kv -> {
                    String[] ss = kv.split("\\=", 2);
                    return Map.of(ss[0], ss[1]);
                })
                //把所有Map聚合到一个Map
                .reduce(new HashMap<String, String>(), (m, kv) -> {
                    m.putAll(kv);
                    return m;
                });
        //打印结果
        map.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
    }
}
