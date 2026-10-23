package THREADQA;

import java.beans.Introspector;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsClassExample {

    public static void main(String[] args) {
        Map<String,Integer> coins = new HashMap<String, Integer>(){{
           put("GPB",200);
           put("USD",80);
           put("KGS",70);
           put("RUB",90);
        }};

        String minResult = coins.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                        .map(entry -> entry.getKey() + "=" + entry.getValue())
                                .orElse("ничего");
        System.out.println(minResult);

//        Map<String, Integer> filterValute = coins.entrySet().stream()
//                .filter(x -> x.getValue()> 75)
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue,
//                        (first,second) -> first, LinkedHashMap::new));
//        List<String> result = filterValute.keySet().stream().toList();
//        System.out.println(result);
//        System.out.println(filterValute);

//        System.out.println(coins);
//
//        Map<String, Integer> reverse = coins.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .collect(Collectors.toMap(Map.Entry :: getKey,Map.Entry :: getValue,
//                        (first,second) -> first, LinkedHashMap::new));
//        System.out.println(reverse);



        List<String> email = Arrays.asList(
                "test@gmail.com", "test@bk.ru", "test1@gmail.com",
                "test2@gmail.com", "random@test.kg", "test3@gamail.com", "test1@gmail.com"
        );


        boolean isKG = email.stream().anyMatch(x -> x.endsWith("kg"));
        System.out.println(isKG);

        List<String> uniqGmail = email.stream()
                .filter(x -> x.endsWith("gmail.com"))
                .distinct().collect(Collectors.toList());
        System.out.println(uniqGmail);

        List<String> abc = email.stream()
                .sorted()
                .toList();
        System.out.println(abc);


//
//        boolean isAllGmail  = email.stream().allMatch(x -> x.endsWith("@gmail.com"));
//        boolean notGmail = email.stream().noneMatch(x -> x.endsWith("yandex"));
//
//        System.out.println(isAllGmail);
//        System.out.println(notGmail);

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
