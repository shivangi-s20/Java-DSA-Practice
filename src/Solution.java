public class Solution {
    static int[] sortArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    static int missingNumber(int[] arr) {
        int xorSum = 0;
        //xor with all array elements
        for (int n : arr) {
            xorSum = xorSum ^ n;
        }
        //xor with all the element in the range
        for (int i = 0; i <= arr.length; i++) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }

    static int findUniqueElement(int[] nums) {
        int xorSum = 0;
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    static int[] arrSort(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 1, 0};
        arrSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

//        int nums[] = {1, 2, 4, 4, 3, 3, 1};
//        int ans = findUniqueElement(nums);
//        System.out.println(ans);

//        int arr[] ={0, 2, 4, 5, 3};
//        int ans = missingNumber(arr);
//        System.out.println(ans);

//        int[] arr = {1, 1, 0, 0, 0, 1, 1, 0};
//        int[] result = sortArray(arr);
//
//        for(int num: result){
//            System.out.println(num + " ");
//        }
    }
}
