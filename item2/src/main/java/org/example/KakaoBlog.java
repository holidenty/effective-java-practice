package org.example;

public class KakaoBlog {

    //일반적인 Constructor 다량 생산, 코드가 더러워짐

    private final String query;
    private final String sort;
    private final int page;
    private final int size;

    public KakaoBlog (String query) {
        this.query = query;
        this.sort = "accuracy";
        this.page = 1;
        this.size = 10;
    }

    public KakaoBlog (String query, String sort) {
        this.query = query;
        this.sort = sort;
        this.page = 1;
        this.size = 10;
    }

    public KakaoBlog (String query, String sort, int page) {
        this.query = query;
        this.sort = sort;
        this.page = page;
        this.size = 10;
    }

    public KakaoBlog (String query, String sort, int page, int size) {
        this.query = query;
        this.sort = sort;
        this.page = page;
        this.size = size;
    }

}
