package setup1;

public class Client {
    public static void main(String[] args) {
        WeeklyLog log_previous = new WeeklyLog(); // 创捷原型对象
        log_previous.setName("张学友");
        log_previous.setData("第十二周");
        log_previous.setContent("这周很忙，每天加班");

        System.out.println("******周报******");
        System.out.println("周次" + log_previous.getData());
        System.out.println("姓名" + log_previous.getName());
        System.out.println("内容" + log_previous.getContent());
        System.out.println("--------------------------------");

        WeeklyLog log_new;
        log_new = log_previous.clone(); // 调用克隆方法创建克隆对象
        log_new.setData("第三周");
        System.out.println("******周报******");
        System.out.println("周次" + log_new.getData());
        System.out.println("姓名" + log_new.getName());
        System.out.println("内容" + log_new.getContent());
        System.out.println("--------------------------------");

        // 浅克隆
        Attachment attachment = new Attachment(); // 创建附件对象
        log_previous.setAttachment(attachment); // 将附件添加到周报中
        log_new = log_previous.clone(); // 调用克隆方法创建克隆对象
        // 比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        // 比较附件
        System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_new.getAttachment()));
        System.out.println("--------------------------------");


        System.out.println(log_previous == log_new);
        System.out.println(log_previous.getData() == log_new.getData());
        System.out.println(log_previous.getName() == log_new.getName());
        System.out.println(log_previous.getContent() == log_new.getContent());
    }
}
