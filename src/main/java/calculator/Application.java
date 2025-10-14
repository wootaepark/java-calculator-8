package calculator;


import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {

        long sum = 0;

        // 문자열 입력
        System.out.println("덧셈할 문자열을 입력해 주세요");
        String input_string = Console.readLine(); // ex : "1,2:3"

        if (!input_string.isEmpty()) {
            String[] numbers = input_string.split("[,:]"); // , 또는 : 문자로 문자열 분해
            // System.out.println(Arrays.toString(numbers));
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
        }

        System.out.println("결과 : " + sum);


    }


}
