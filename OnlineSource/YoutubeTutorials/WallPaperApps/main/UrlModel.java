package com.example.wallpaperapp;

public class UrlModel {


    // https://www.pexels.com/ko-kr/api/documentation/#photos-curated 에 있는 portrait 호출하기
   private String portrait;

    public UrlModel(String portrait) {
        this.portrait = portrait;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }
}
