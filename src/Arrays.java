import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int[][] arr = {
                {8, 2, 5},
                {4, 15, 9}
        };
        int max = arr[0][0];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);

//        int[][] arr = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        //input
//        for(int i=0;i<=arr.length-1;i++){
//            for(int j=0;j<=arr[i].length-1;j++){
//                System.out.println("Provide value for row =" + i + "and column =" + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        //print
//        for(int rowindex =0; rowindex<=arr.length-1; rowindex++){
//            for(int columnindex =0; columnindex<=arr[rowindex].length-1; columnindex++){
//                System.out.print(arr[rowindex][columnindex]+" ");
//            }
//            System.out.println();
//        }


        //declaration
//        int[][] arr;
//        //allocation
//        arr = new int[3][4];
//        //initialization
//        int [][] brr ={
//                {1, 2},
//                {2, 3, 4, 5},
//                {3, 4, 5, 6, 7},
//                {4}
//        };
//        int rowlength= brr.length;
////        int  columnlength = brr[0].length;
////        System.out.println(brr[2][1]);
//        for(int i=0;i<=rowlength-1;i++){
//            //jaise hi kisi nye row me aayenge
//            //same point pr maine uska column length find out kr liya
////            current row -> brr[i]
////            isme kitne column h -> brr[i].length
//              int collumlength = brr[i].length;
//            for(int j=0; j<=collumlength-1; j++){
//                System.out.print(brr[i][j]+ " ");
//            }
//            System.out.println();
//        }

        //traversal 2 D array
//        for(int i =0; i<=brr.length-1; i++){
//            for(int j =0; j<=brr[i].length-1; j++){
//                System.out.print(brr[i][j]+" ");
//            }
//        }
//



//        int arr[] = {3, 2, -5, 21, 10};
//        int n = arr.length;
//        int min = arr[0];
//        for(int i=0;i<=n-1;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        };
//        System.out.println("min value is:" + min);

//        int arr[] = {3, 2, -5, 21, 10};
//        int n = arr.length;
//        int max = arr[0];
//        for(int i=0;i<=n-1;i++){
//            if(arr[i]>max){
//                max = arr[i];
//                System.out.println("max value is:" + arr[i]);
//            }
//        }


//        int arr[] = {2, 4, 5, 8};
//        int mul= 1;
//        int n = arr.length;
//
//        for(int i=0;i<=n-1;i++){
//            mul = mul*arr[i];
//        }
//        System.out.println(mul);

//        int arr[] = {10, 20, 30, 40, 50};
//        int sum = 0;
//        int n = arr.length;
//        for(int i =0; i<=n-1; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);

//        int arr[] = new int[5];
//        Scanner in = new Scanner(System.in);
//        int n = arr.length;
//        //input
//        for(int i=0;i<=n-1;i++){
//            System.out.println("Provide input for index : "+ i);
//            arr[i] = in.nextInt();
//        }
//        //print
//        for(int val: arr){
//            System.out.println(val);
//        }
//        //declaration
//        int arr[];
//        //allocation
//        arr = new int[5];
//        //initialization
//        int brr[]= {10, 20, 30};
//        int n = brr.length;
////        for(int i=0;i<=n-1;i++){
////            System.out.println(brr[i]);
////        }
//        for(int val : brr){
//            System.out.println(val);
//        };
//
////        System.out.println("Value at index: "+ brr[0]);
    };

};
