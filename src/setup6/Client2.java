package setup6;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/18 15:38
 */
public class Client2 {

    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
//        factory = new FileLoggerFactory();
        factory = (LoggerFactory) XMLUtil.getBean(); //getBean()的返回类型为Object，需要进行强制类型转换
        logger = factory.createLogger();
        logger.writeLog();
    }
}

interface Logger {
    void writeLog();
}

class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("writer file log...");
    }
}

class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("writer file log...");
    }
}

interface LoggerFactory {
    Logger createLogger();
}

class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}

class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
