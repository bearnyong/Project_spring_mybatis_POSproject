package com.pos.min_mart;

import com.pos.min_mart.config.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
        * 김민환은 [A과일가게]를 인수하여 ⓐ채소와 ⓑ과일를 판매하고자 한다.
        * 가게를 스마트하게 운영하고자 다음과 같은 프로그램을 의뢰하게 되며, 의뢰 기능은 다음과 같다.
        *
        * 조건 01 ) 아침 06:00 이후 익일로 시작되며, 당일 오후 24:00를 기준으로 마감한다.
        * 조건 01-1 ) 마감시 당일 판매 제품별 중량 및 매출액을 기록한다.★ (프로그램을 종료하면 정보 바이바이)
        * 조건 02 ) 제품을 선택하여 중량 당 단가를 표시하며 고객이 구매하는 제품별 가격 및 총 가격을 안내한다.
        * */

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        PosService posService = context.getBean("posService", PosService.class);

    }
}