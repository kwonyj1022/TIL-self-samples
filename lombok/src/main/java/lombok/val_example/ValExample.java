package lombok.val_example;

import lombok.val;

import java.util.ArrayList;

public class ValExample {

    // val valInt = 1;  // 필드에 사용 불가

    public void example() {
        val valInt = 1; // 지역 변수에 사용 가능
//        valInt = 2;   // 재할당 불가 (final 처럼 동작)
        System.out.println("valInt = " + valInt);

        val array = new ArrayList<String>();
        array.add("hello val");

        for (val s : array) {     // foreach 루프에서 사용 가능
            System.out.println(s);
        }

//        for (val i = 0; i < array.size(); i++) {    // 기본 for문에서는 사용 불가
//        }
    }
}
