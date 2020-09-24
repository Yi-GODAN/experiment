package setup6.HomeWork.CollectionDemo;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/07 21:47
 */
public enum GenderEnumerate {
    MALE("男"),
    FEMALE("女");

    private String name;

    GenderEnumerate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
