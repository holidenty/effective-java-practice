package org.example;

public class KakaoBlogSBS {


    //점층적 생성자 패턴, 하지만 호출하는 쪽에서 파라미터 구분이 힘듬, 어떤 파라미터에 어떤 값을 주고 있는지 혼동

    private final String query;
    private final String sort;
    private final int page;
    private final int size;

    public KakaoBlogSBS(String query) {
        this(query, "accuracy");
    }
    public KakaoBlogSBS(String query, String sort) {
        this(query, sort, 1);
    }
    public KakaoBlogSBS(String query, String sort, int page) {
        this(query, sort, 1, 10);
    }
    public KakaoBlogSBS(String query, String sort, int page, int size) {
        this.query = query;
        this.sort = sort;
        this.page = page;
        this.size = size;
    }

}
