package prac02;

import java.util.*;

// Lv2. 스파르타 자판기
public class Level2 {
    public static void main(String[] args) {
        // 메뉴 맵 생성
        Map<String, Integer> menu = new HashMap<>();
        menu.put("사이다", 1700);
        menu.put("콜라", 1900);
        menu.put("식혜", 2500);
        menu.put("솔의눈", 3000);

        for (Map.Entry<String, Integer> entrySet : menu.entrySet()) {
            System.out.println(entrySet.getKey() + " " + entrySet.getValue() + "원");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("어떤 음료를 사나요? : ");
        String choice = scanner.nextLine();
        if (!menu.containsKey(choice)) {
            System.out.println("메뉴에 없음");
            return;
        }

        System.out.print("얼마를 넣을건가요? (ex: 2000) : ");
        int pay = scanner.nextInt();
        if (pay < menu.get(choice)) {
            System.out.println("돈이 부족합니다");
        } else {
            System.out.println(pay - menu.get(choice) + "원");
        }
        scanner.close();
    }
}


