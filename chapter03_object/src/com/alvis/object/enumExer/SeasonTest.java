package com.alvis.object.enumExer;

public class SeasonTest {

    public static void main(String[] args) {
        System.out.println(Season.season1);

        // toString方法 默认打印的是对象名称  season1
        System.out.println(SeasonEnum.season1);

        // 如果toString重写了，则可以通过name方法去获取
        System.out.println(SeasonEnum.season2.name());

        // vlaues 返回枚举内所有的对象
        SeasonEnum[] values = SeasonEnum.values();
        for (SeasonEnum value : values) {
            System.out.println(value);
        }

        // valueof 根据对象的名字获取到对象
        String objName = "season1";
        System.out.println(SeasonEnum.valueOf(objName));

        // ordinal  返回当前枚举常量的次序号  默认从0开始
        System.out.println(SeasonEnum.season1.ordinal());

        SeasonEnum.season4.show();

    }

}

// jdk5.0之前，手写enum
class Season {
    private final String SeasonName;
    private final String SeasonDesc;

    private Season(String seasonName, String seasonDesc) {
        this.SeasonName = seasonName;
        this.SeasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return SeasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }

    public static final Season season1 = new Season("春天", "春暖花开");
    public static final Season season2 = new Season("夏天", "烈日炎炎");
    public static final Season season3 = new Season("秋天", "秋高气爽");
    public static final Season season4 = new Season("冬天", "寒风凛凛");

    @Override
    public String toString() {
        return "Season{" +
                "SeasonName='" + SeasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}
