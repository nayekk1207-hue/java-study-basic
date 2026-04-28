import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("C 혹은 F 중 변화할 단위를 선택하거나 종료하려면 exit를 입력하세요.");
            String answer = in.next();


            //섭씨 -> 화씨 변환
            if (answer.equals("C")) {
                System.out.print("섭씨 온도를 입력하세요 : ");
                double celsius = in.nextDouble();
                double result = celsiusToFahrenheit(celsius);
                System.out.printf("변환 결과: 화씨 %.1f도입니다.\n\n", result);

            }
            //화씨 -> 섭씨 변환
            if (answer.equals("F")) {
                System.out.print("화씨 온도를 입력하세요: ");
                double fahrenheit = in.nextDouble();
                double result = fahrenheitToCelsius(fahrenheit);
                System.out.printf("변환 결과: 섭씨 %.2f도입니다.\n\n", result);
            }
            //종료할 경우
            else if (answer.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit ;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8 ;
        return celsius ;
    }

}
