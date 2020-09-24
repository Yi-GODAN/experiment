package setup1;

//工作周报WeeklyLog：具体原型类，考虑到代码的可读性和易理解性，只列出部分与模式相关的核心代码
public class WeeklyLog implements Cloneable {
    private String name;
    private String data;
    private String content;
    private Attachment attachment;

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return (this.attachment);
    }

    public String getName() {
        return (this.name);
    }

    public String getData() {
        return (this.data);
    }

    public String getContent() {
        return (this.content);
    }

    // 克隆方法clone()，此处使用Java语言提供的克隆机制
    public WeeklyLog clone() {
        Object obj = null;
        try {
            obj = super.clone(); // 调用父类的clone方法
            return (WeeklyLog) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }


}
