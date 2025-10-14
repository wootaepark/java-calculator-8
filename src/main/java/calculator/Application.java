package calculator;


import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        // 문자열 입력
        System.out.print("input String : ");
        String input_string = Console.readLine(); // ex : "1,2:3"

        String[] numbers = input_string.split("[,:]"); // , 또는 : 문자로 문자열 분해
        System.out.println(Arrays.toString(numbers));


    }


}
