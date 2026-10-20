package THREADQA;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsClassExample {

    public static void main(String[] args) {
        List<String> email = Arrays.asList(
                "test@gmail.com", "test@bk.ru", "test1@gmail.com",
                "test2@gmail.com", "random@test.kg", "test3@gamail.com", "test1@gmail.com"
        );

        boolean isAllGmail  = email.stream().allMatch(x -> x.endsWith("@gmail.com"));
        boolean notGmail = email.stream().noneMatch(x -> x.endsWith("yandex"));

        System.out.println(isAllGmail);
        System.out.println(notGmail);

//        List<String> uniq = email.stream().distinct().collect(Collectors.toList());
//        System.out.println(uniq);
//        List<String> gmails = email.stream().filter(x -> x.endsWith("@gmail.com")).collect(Collectors.toList());
//        System.out.println(gmails);
//        String  findFirst = email.stream().filter(x -> x.endsWith("@gmail.com")).findFirst().get();
//        System.out.println(findFirst);
//        String findAny = email.stream().filter(x -> x.endsWith("@gmail.com")).findAny().get();
//        System.out.println(findAny);
//        String randomAny = email.stream().parallel().filter(x -> x.endsWith("@gmail.com")).findAny().get();
//        System.out.println(randomAny);
//
//        Random random = new Random();
//        int randomNum = random.nextInt(email.size());
//        System.out.println(email.get(randomNum));
    }
}
