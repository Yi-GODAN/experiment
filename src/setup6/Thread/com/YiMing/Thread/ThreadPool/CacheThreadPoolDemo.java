package setup6.Thread.com.YiMing.Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/03 18:25
 */
public class CacheThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 20; i++) {
            executorService.execute(new Tasks());
        }

        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        executorService1.execute(new Tasks());
    }
}
