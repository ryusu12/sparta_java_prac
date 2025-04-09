package prac02;

import java.util.*;

// 보너스 문제: 가위 바위 보
public class Bonus {
    public static void main(String[] args) {
        String[] game = {"가위", "바위", "보"};
        Map<Integer, String> gifts = new HashMap<>();
        gifts.put(0, "꽝");
        gifts.put(1, "곰돌이 인형");
        gifts.put(2, "스파르타 랜드 입장권");
        gifts.put(3, "스파르타 캐니언 항공 투어권");
        gifts.put(4, "호텔 스파르타 숙박권");
        gifts.put(5, "스파르테이트 항공권");

        Scanner scanner = new Scanner(System.in);
        int game_cnt = 5;
        int win_cnt = 0;
        //<----------선언----------------------->

        while (game_cnt > 0) {
            System.out.println("가위 바위 보 중 하나를 입력하세요!");
            String user = scanner.next();

            // 컴퓨터의 선택
            String computer = game[(int) (Math.random() * 3)];

            // 승패 결과
            // 기본을 '지는 경우'으로 하고, '비긴 경우'를 공통으로 따로 지정해준다.
            // 이후 각 상황에 따라 '이긴 경우'를 if 문으로 지정해준다.
            String result = "당신이 졌습니다..";
            if (user.equals(computer)) {
                result = "서로 비겼습니다.";
            } else if (user.equals("가위")) {
                if (computer.equals("보")) {
                    result = "당신이 이겼습니다!";
                    win_cnt += 1;
                }
            } else if (user.equals("바위")) {
                if (computer.equals("가위")) {
                    result = "당신이 이겼습니다!";
                    win_cnt += 1;
                }
            } else if (user.equals("보")) {
                if (computer.equals("바위")) {
                    result = "당신이 이겼습니다!";
                    win_cnt += 1;
                }
            } else {
                // 잘못된 입력을 받을 때
                System.out.println("잘못된 입력입니다!");
                continue;
            }
            game_cnt -= 1;
            System.out.println("당신은 \"" + user + "\", 그리고 상대는 \"" + computer + "\"으로, " + result);
        }

        System.out.println("축하합니다! 총 " + win_cnt + "회 승리하여 경품으로 [" + gifts.get(win_cnt) + "]을 획득하셨습니다!");
        scanner.close();
    }
}


