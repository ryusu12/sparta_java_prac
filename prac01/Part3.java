package prac01;

// 반복문 연습하기 Part 3
// 3. 구구단 출력하기
public class Part3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }
}
