package setup6.HomeWork.OOP.ClassroomPractice;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/08/12 11:58
 */
public enum Variety {
    ChineseDog("中华田园犬"),
    Shepherd("德牧");

    private String variety;

    Variety(String variety) {
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
