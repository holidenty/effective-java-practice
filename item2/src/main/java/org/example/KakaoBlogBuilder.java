package org.example;

public class KakaoBlogBuilder {

    //생성자 체이닝을 사용한 것의 장점과 beans의 장점을 둘다 활용
    //항상 빌더가 옳진 않음. 코드가 어려

    private final String query;
    private final String sort;
    private final int page;
    private final int size;

    public static void main(String[] args) {
        KakaoBlogBuilder kakaoBlog = new Builder("검색어")
                .sort("accuracy")
                .page(5)
                .size(1)
                .build();
    }


    public static class Builder {
        private final String query;

        private String sort = "";
        private int page = 1;
        private int size = 10;

        public Builder(String query) {
            this.query = query;
        }

        public Builder sort(String val) throws java.lang.IllegalArgumentException {
            if(sort.equals("accuracy") || sort.equals("recency")) {
                sort = val;
                return this;
            }
            throw new java.lang.IllegalArgumentException("Sort Parameter is to be only accuracy or recency" + val);
        }

        public Builder page(int val) throws java.lang.IllegalArgumentException {
            page = val;
            return this;
        }

        public Builder size(int val) {
            size = val;
            return this;
        }

        public KakaoBlogBuilder build() {
            return new KakaoBlogBuilder(this);
        }
    }

    private KakaoBlogBuilder (Builder builder) {
        query = builder.query;
        sort = builder.sort;
        page = builder.page;
        size = builder.size;
    }
}
