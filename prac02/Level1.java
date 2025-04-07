package prac02;

// Lv1. 랜덤 닉네임 생성기
public class Level1 {
    // 1. 키워드를 전역 변수로 보호
    private static String[] name1 = {"기철초풍", "멋있는", "재미있는"};
    private static String[] name2 = {"도전적인", "노란색의", "바보같은"};
    private static String[] name3 = {"돌고래", "개발자", "오랑우탄"};

    // 2. 난수 생성 과정을 메서드로 묶음
    public String createRandomName (String[] name) {
        int num = (int) (Math.random() * name.length);
        return name[num];
    }

    public static void main(String[] args) {
        Level1 level1 = new Level1();

        String first = level1.createRandomName(name1);
        String second = level1.createRandomName(name2);
        String third = level1.createRandomName(name3);

        System.out.println(first + " " + second + " " + third);
    }
}