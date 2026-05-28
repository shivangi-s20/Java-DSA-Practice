import java.util.HashMap;
import java.util.*;
public class ArrayManipulationProblems {

    static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void shiftBy1(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i = n-1; i>0; i--){
            arr[i] =arr[i-1];
        }
        arr[0] = temp;
    }

    static void printAlternate(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }

    static void getMode(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        for(int i : freq.keySet()){
            System.out.println(i + "-> "+ freq.get(i));
        }
    }

    static void getUnion(int arr1[], int arr2[]){
        HashSet<Integer> set= new HashSet<>();

        for(int i =0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i =0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("Union: "+ set);
    }

    public static void main(String[] args) {
        int arr1[]={1, 2, 3, 4, 5};
        int arr2[]={3, 4, 5, 6, 7};
        getUnion(arr1, arr2);


    }
//        int arr[] = {1, 2, 2, 4, 4, 4, 1, 6, 6, 8, 4};
//        getMode(arr);
//    }
//        printAlternate(arr);
//        reverseArray(arr);
//        shiftBy1(arr);
//        for(int num: arr){
//            System.out.print(num + " ");
//        }

}
