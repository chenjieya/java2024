package com.alvis.object.enumExer;

public enum SeasonEnum {

//    public static final Season season1 = new Season("春天", "春暖花开");
//    public static final Season season2 = new Season("夏天", "烈日炎炎");
//    public static final Season season3 = new Season("秋天", "秋高气爽");
//    public static final Season season4 = new Season("冬天", "寒风凛凛");

    season1("春天", "春暖花开"),
    season2("夏天", "烈日炎炎"),
    season3("秋天", "秋高气爽"),
    season4("冬天", "寒风凛凛");

    private final String SeasonName;
    private final String SeasonDesc;

    private SeasonEnum(String seasonName, String seasonDesc) {
        this.SeasonName = seasonName;
        this.SeasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return SeasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "SeasonName='" + SeasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}
