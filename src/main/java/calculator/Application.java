package calculator;


import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {

        // 문자열 입력
        System.out.println("덧셈할 문자열을 입력해 주세요");
        String input_string = Console.readLine(); // ex : "1,2:3"

        System.out.println("결과 : " + calculator(input_string));


    }

    private static long calculator(String input_string) {
        if (input_string.isEmpty()) {
            return 0;
        }

        String[] numbers = parseNumbers(input_string);
        long sum = 0;
        for (String number : numbers) {
            long op = Long.parseLong(number);
            if (op <= 0) {
                throw new IllegalArgumentException("양의 정수만 입력이 가능합니다.");
            }
            sum += op;

        }
        return sum;
    }

    private static String[] parseNumbers(String input_string) {
        if (input_string.contains("//") && input_string.contains("\\n")) {
            String[] parts = input_string.split("\\\\n");
            char separator = parts[0].charAt(2);
            return parts[1].split(String.valueOf(separator));
        }
        return input_string.split("[,:]");
    }

}
