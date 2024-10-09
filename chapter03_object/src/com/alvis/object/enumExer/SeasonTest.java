package com.alvis.object.enumExer;

public class SeasonTest {

    public static void main(String[] args) {
        System.out.println(Season.season1);
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
