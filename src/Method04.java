import java.util.Arrays;
import java.util.Scanner;

public class Method04 {
    static Scanner scan = new Scanner(System.in);


    public static int[] inputNums() {
        int nums[] = new int[10];

        System.out.println("정수 10개 입력");
        for (int i  = 0; i <nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        return nums;
    }

    public static void Array(int nums[]) {
        Arrays.sort(nums);
    }

    public static void outputNums(int nums[]) {
        for (int i  = 0; i <nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {

        int nums[];
        nums = inputNums();

        Array(nums);

        outputNums(nums);


//                문제) p.126 5번

//        System.out.println("정수 10개 입력");
//        int nums[] = new int[10];
//        for (int i  = 0; i <nums.length; i++) {
//            int num = scan.nextInt();
//            nums[i] = num;
//        }


//        Arrays 클래스의 정렬 메서드 sort() 사용하여 정렬
//        Arrays.sort(nums);


//              정렬하는 방법 2
//        for(int i = 0; i < numbers.length; i++) {
//            for (int j = i; j < numbers.length; j++) {
//                if (numbers[i] > numbers[j]) {
//                    int tmp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = tmp;
//                }
//            }
//        }


//        for (int i  = 0; i <nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }

    }
}
