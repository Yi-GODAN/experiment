package setup6.Internet;

import setup6.Internet.client.client4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 10:21
 */
public class test2 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new client4());
    }
}
