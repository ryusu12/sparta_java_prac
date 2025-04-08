package prac02;

import java.util.*;

// Lv2. 스파르타 자판기
public class Level3 {
    public static void main(String[] args) {
        String[] words = {
                "airplane", "apple", "arm", "bakery", "banana", "bank", "bean", "belt", "bicycle", "biography", "blackboard", "boat", "bowl", "broccoli", "bus",
                "car", "carrot", "chair", "cherry", "cinema", "class", "classroom", "cloud", "coat", "cucumber",
                "desk", "dictionary", "dress", "ear", "eye", "fog", "foot", "fork", "fruits",
                "hail", "hand", "head", "helicopter", "hospital", "ice", "jacket", "kettle", "knife", "leg", "lettuce", "library",
                "magazine", "mango", "melon", "motorcycle", "mouth", "newspaper", "nose",
                "notebook", "novel", "onion", "orange", "peach", "pharmacy", "pineapple", "plate", "pot", "potato", "rain",
                "shirt", "shoe", "shop", "sink", "skateboard", "ski", "skirt", "sky", "snow", "sock", "spinach", "spoon", "stationary", "stomach", "strawberry", "student", "sun",
                "supermarket", "sweater", "teacher", "thunderstorm", "tomato", "trousers", "truck", "vegetables", "vehicles", "watermelon", "wind"
        };

        // 1. 컴퓨터가 랜덤으로 영어단어를 선택합니다 - 영어단어의 자리수를 알려줍니다
        String answer_word = words[(int) (Math.random() * words.length)].toUpperCase();

        // 1.a. 정답 단어만큼 밑줄 생성
        char[] answer = new char[answer_word.length()];
        for (int i = 0; i < answer_word.length(); i++) {
            answer[i] = '_';
            System.out.print(answer[i]);
        }

        // 입력받기
        Scanner scan = new Scanner(System.in);
        String user_word;
        String already_used="";

        // 3. 사용자가 9번 틀리면 게임오버됩니다.
        int chance = 9;
        while (chance > 0) {
            System.out.print("\n(A-Z)을 입력하세요 (남은 기회: " + chance + "): ");
            user_word = scan.next().toUpperCase();
            // a. A-Z 사이의 알파벳이 아니라면 다시 입력을 받습니다
            // b. 입력값이 한 글자가 아니라면 다시 입력을 받습니다
            // c. 이미 입력했던 알파벳이라면 다시 입력을 받습니다.
            if ((!Character.isLetter(user_word.charAt(0))) || (user_word.length() != 1) || already_used.contains(user_word)) {
                System.out.print("다시 입력하세요");
                continue;
            }
            already_used += user_word;

            // d. 입력값이 정답에 포함된 알파벳일 경우 해당 알파벳이 들어간 자리를 전부 보여주고, 다시 입력을 받습니다.
            boolean no_exist = true;
            boolean check_end = true;

            for (int i = 0; i < answer_word.length(); i++) {
                if (answer_word.charAt(i) == user_word.charAt(0)) {
                    no_exist = false;
                    answer[i] = user_word.charAt(0);
                }
                if(answer[i]=='_') {
                    check_end = false;
                }
                System.out.print(answer[i]);
            }
            // e. 입력값이 정답에 포함되지 않은 알파벳일 경우 기회가 하나 차감되고, 다시 입력을 받습니다.
            if (no_exist) {
                chance -= 1;
            }
            // 4. 게임오버 되기 전에 영어단어의 모든 자리를 알아내면 플레이어의 승리입니다.
            if (check_end) {
                System.out.println("\n 플레이어의 승리 : " + Arrays.toString(answer));
                break;
            }
        }
    }
}