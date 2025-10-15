package calculator;


import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {

        long sum = 0;

        // 문자열 입력
        System.out.println("덧셈할 문자열을 입력해 주세요");
        String input_string = Console.readLine(); // ex : "1,2:3"

        // 비어 있지 않은 경우 계산식 수행
        if (!input_string.isEmpty()) {

            // 정규 표현식 : // 뒤 에서 \\n 앞까지의 문자열을 찾는다.
            if (input_string.contains("//") && input_string.contains("\\n")) {
                
                char separator = input_string.charAt(input_string.indexOf("//") + 2);

                String sub = input_string.substring(input_string.indexOf("\\n") + 2);

                String[] numbers = sub.split(String.valueOf(separator));

                for (String number : numbers) {
                    sum += Long.parseLong(number);
                }


            } else {
                // case 1 : , : 구분자
                String[] numbers = input_string.split("[,:]"); // , 또는 : 문자로 문자열 분해

                for (String number : numbers) {
                    sum += Long.parseLong(number);
                }
            }


        }

        System.out.println("결과 : " + sum);


    }


}
