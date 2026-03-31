public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("=== 자바 계산기 프로그램 ===");
        System.out.println("더하기: " + (a + b));
        System.out.println("빼기: " + (a - b));
        System.out.println("곱하기: " + (a * b));
        if (b != 0) {
            System.out.println("나누기: " + (a / b));
        } else {
            System.out.println("0으로 나눌 수 없음");
        }
    }
}