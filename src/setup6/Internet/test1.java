package setup6.Internet;

import setup6.Internet.server.server4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/05 10:00
 */
public class test1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new server4());
    }
}
