package setup1;

public class Client1 {

    public static void main(String args[]) {
        WeeklyLog1 log_previous1, log_new1 = null;

        log_previous1 = new WeeklyLog1(); // 创建原型对象
        Attachment1 attachment1 = new Attachment1(); // 创建附件对象
        log_previous1.setAttachment(attachment1); // 将附件添加到周报中

        try {
            log_new1 = log_previous1.deepClone(); // 调用深克隆方法创建克隆对象
        } catch (Exception e) {
            System.err.println("克隆失败！");
        }
        // 比较周报
        System.out.println("周报是否相同？ " + (log_previous1 == log_new1));
        // 比较附件
        System.out.println("附件是否相同？ " + (log_previous1.getAttachment() == log_new1.getAttachment()));

    }
}
