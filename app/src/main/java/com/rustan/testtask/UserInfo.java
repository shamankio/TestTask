package com.rustan.testtask;


import com.orm.SugarRecord;

public class UserInfo extends SugarRecord {
   String title;
    String langage;
     int count1;
    int count2;

    public UserInfo() {
    }

    public UserInfo(String title, String langage, int count1, int count2) {
        this.title = title;
        this.langage = langage;
        this.count1 = count1;
        this.count2 = count2;
    }

    public String getTitle() {
        return title;
    }

    public String getLangage() {
        return langage;
    }

    public int getCount1() {
        return count1;
    }

    public int getCount2() {
        return count2;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "title='" + title + '\'' +
                ", langage='" + langage + '\'' +
                ", count1=" + count1 +
                ", count2=" + count2 +
                '}';
    }
}
