package com.example.wallpaperapp;

public class ImageModel {

    // https://www.pexels.com/ko-kr/api/documentation/#photos-curated 에 있는 src 호출하기
    // src 의 목표는 사진을 세로로 설정하기 위한 과정이다
    private UrlModel src;

    public ImageModel(UrlModel src) {
        this.src = src;
    }

    public UrlModel getSrc() {
        return src;
    }

    public void setSrc(UrlModel src) {
        this.src = src;
    }
}
