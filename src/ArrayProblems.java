public class ArrayProblems {
//    static double getAverage(int[] arr){
//        int sum = 0;
//        for(int i : arr){
//            sum += i;
//        }
//        int size = arr.length;
//        double avg = sum/size;
//        return avg;
//    }

       static int[] multiplyBy10(int[] arr){
           int size = arr.length;
           int newArray[] = new int[size];

           for(int i=0; i<size; i++){
               int element = arr[i];
               int newElement = element * 10;
               newArray[i]= newElement;
           }
           return newArray;
       }

       // linear search

       static boolean findTarget(int arr[], int target){
           for(int i =0; i<arr.length; i++){
               if(arr[i]==target){
                   return true;
               }
           }
           return false;
       }

       static int getMaximum(int arr[]){
           int max=arr[0];
           for(int num : arr){
               max = Math.max(max, num);
               }
           return max;
       }

       static int[] posNegSum(int arr[]){
           int posSum = 0;
           int negSum = 0;
           for(int i = 0; i<arr.length; i++){
               if(arr[i]>0){
                   posSum = posSum + arr[i];
               }
               else{
                   negSum = negSum + arr[i];
               }
           }
           int ans[]={posSum, negSum};
           return ans;
       }

    static int[] getZeroOneCount(int arr[]){
           int zeroCount = 0;
           int oneCount = 0;
           for( int i=0; i<arr.length; i++){
               if(arr[i]==0){
                   zeroCount++;
               }
               else{
                   oneCount++;
               }
           }
           int ans[] ={zeroCount, oneCount};
           return ans;
    }

        static int getUnsortedElement(int arr[]){
           for(int i = 0; i<arr.length; i++){
               if(arr[i+1]<=arr[i]){
                   return arr[i+1];
               }
           }
           return -1;
        }

        static int[] getArrSwap(int arr[]){
           for( int i = 0; i<arr.length-1; i++) {
               int temp = arr[i];
               arr[i] = arr[i + 1];
               arr[i + 1] = temp;
           }
           return arr;
        }

        static void intersection(int arr1[], int arr2[]){
           for(int i=0; i<arr1.length; i++){
               for(int j = 0; j<arr2.length; j++){
                   if(arr1[i]==arr2[j]){
                       System.out.println(arr1[i] + " ");
                       break;
                   }
               }
           }
        }

    public static void main(String[] args) {
        int arr1[] = {3, 4, 7, 9, 2};
        int arr2[] = {1, 5, 2, 7, 8};
        intersection(arr1, arr2);
    }

//        int arr[] = {2, 5, 9, 1, 8};
//        int result[] = getArrSwap(arr);
//        for(int num: result){
//            System.out.println(num + " ");
//        }
//    }

//       int arr[] = {1, 2, 5, 4, 9};
//        System.out.println(getUnsortedElement(arr));
//
//    }

//           int arr[]={0, 1, 0, 1, 1, 1};
//           int ans[]=getZeroOneCount(arr);
//        System.out.println("ZeroCount = "+ ans[0]);
//        System.out.println("OneCount = "+ ans[1]);
//    }
//        int arr[] = {3, 5, -4, 8, -6};
//        int ans[] = posNegSum(arr);
//        System.out.println("Positive sum is : "+ ans[0]);
//        System.out.println("Negative sum is : "+ ans[1]);
//    }
//
//           int arr[]={4, 2, 8, 5};
//           int maximum=getMaximum(arr);
//        System.out.println(maximum);
//    }
//        int arr[] = {2, 4, 6, 9};
//        boolean ans = findTarget(arr, 6);
//        System.out.println(ans);
//    }

//        int arr[] = {2, 4, 8, 5};
//        int ans[] = multiplyBy10(arr);
//        System.out.println("Answer array is");
//        for(int i: ans){
//            System.out.println(i);
//        }
//    }
}
