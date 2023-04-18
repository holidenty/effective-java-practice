package org.example;

public class KakaoBlogBeans {

    //java beans 패턴의 장점
    //1. 객체를 생성해놓고 시작하므로, 생성 자체는 쉽다
    //java beans 패턴의 단점
    //1. 완벽히 안전한 상태로 생성되기 전에 사용될 가능성이 있다.
    //2. 어디까지 변수를 세팅해야 할지 클라이언트 입장에선 알기 어렵다. (가령, 카카오 블로그는 검색어만 필수 파라미터지만 클라이언트는 어디까지 세팅해야 할지 알수 없다는 말이다)

    private String query = "";
    private String sort = "accuracy";
    private int page = 1;
    private int size = 10;
    private boolean healthy;

    //java beans 규약 (boolean은 get이 아님)
    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    //java beans 규약1. getter와 setter의 네이밍 규칙
    //java beans 규약2. 객체를 만들기 쉬우므로, java beans에서는 파라미터가 없는 기본 생성자를 제공하도록 하고 규약하고 있다.
    //java beans 규약3. Serializable 인터페이스를 구현해야한다 (직렬화를 통해 어딘가에 인스턴스의 값을 저장해 두었다가, 언젠가 역직렬화를 통해 재사용할 수 있게 하기 위해
    //위는 강제는 아니지만 지켜야 하는 수준으로 정의되고 있다
    //스프링이나 타임리프 등 여러 프레임워크에서 값을 가져오거나 참조할때 java beans 스펙을 따른다
    public KakaoBlogBeans() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) throws java.lang.IllegalArgumentException {
        if(sort.equals("accuracy") || sort.equals("recency")) {
            this.sort = sort;
        }
        throw new java.lang.IllegalArgumentException("Sort Parameter is to be only accuracy or recency" + sort);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
