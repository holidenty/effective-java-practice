package org.example;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE) //어노테이션으로 생성하면 내부적으로 모든 파라미터 생성자가 자동으로 생성됨
public class KakaoBlogBuilderAnt {

    //필수값을 지정하는게 불가능함 (극복 불가능)
    //필수값을 지정할 수 없다면 불안정한 상태로 사용될 가능성은 똑같이 있는게 아닌가? (의문)

    private final String query;
    private final String sort;
    private final int page;
    private final int size;

    public static void main(String[] args) {
        KakaoBlogBuilderAnt kakaoBlogBuilderAnt = new KakaoBlogBuilderAntBuilder()
                .query("검색어")
                .page(1)
                .build();

    }

}
