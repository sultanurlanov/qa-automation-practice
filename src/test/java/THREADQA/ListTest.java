package THREADQA;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    static void main() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(6);
        nums.add(4);

        System.out.println(firstLast6(nums));
    }



    public static boolean firstLast6(List<Integer> nums) {

        return nums.get(0) == 6 || nums.get(nums.size() - 1) == 6;

//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(0) == 6 || nums.get(nums.size() - 1) == 6) {
//                return true;
//            }
//        }
//        return false;
    }
    }

