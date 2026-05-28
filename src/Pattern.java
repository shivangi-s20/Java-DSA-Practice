public class Pattern {
    public static void main(String[] args) {
//        int n = 4;
//        for(int i=1; i <=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//Solid esy rectqangle pattern
//        int n = 3;
//        for(int i =1; i<=n; i++){
//            for(int j=1; j<=5; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
// right angle pattern
//          int n = 5;
//          for(int i = 1; i<=n; i++) {
//              for (int j = 1; j <= i; j++) {
//                  System.out.print("* ");
//              }
//              System.out.println();

//Solid Rhombus

//            int n= 5;
//            for(int i=1; i<=n; i++){
//                //for each row -> spaces and stars
//
//                //spaces
//                for(int j =1; j<=n-i; j++) {
//                    System.out.print(" ");
//                }
//                    //stars
//                for(int j=1; j<=n; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//                }

//inverted right angle pattern

//             int n= 5;
//             for(int i=1; i<=n; i++){
//                 for(int j=1; j<=n-i+1; j++){
//                     System.out.print("* ");
//                 }
//                 System.out.println();
//             }

//Solid Pyramid

//               int n = 5;
//               for(int i = 1; i <= n; i++){
//                   //spaces
//                   for(int j = 1; j <=n-i; j++){
//                       System.out.print(" ");
//                   }
//                   //stars
//                   for(int j = 1; j <=2*i-1; j++){
//                       System.out.print("*");
//                   }
//                   System.out.println();
//               }

//inverse Pyramide

//                     int n = 4;
//                     for(int i = 1; i <= n; i++){
//                         for(int j = 1; j <= i-1; j++){
//                             System.out.print(" ");
//                         }
//                         for(int j = 1; j <= 2*n-2*i+1; j++){
//                             System.out.print("*");
//                         }
//                         System.out.println();
//                     }

//Hollow reactangle pattern

//                       int n =4;
//                       for(int i=1;i<=n;i++){
//                           for(int j=1;j<=6;j++){
//                               if(i==1 || i==n){
//                                   System.out.print("* ");
//                               }
//                               else {
//                                   //middle rows
//                                   if(j==1 || j==6){
//                                       System.out.print("* ");
//                                   }
//                                   else{
//                                       //middle column
//                                       System.out.print("  ");
//                                   }
//
//                               }
//                           }
//                           System.out.println();
//                       }

//Hollow triangle

                      int n = 5;
                      for (int i = 1; i <= n; i++) {
                          if(i==1 || i==2 || i==n){
                              for(int j = 1; j <= i; j++) {
                                  System.out.print("* ");
                              }
                          }
                          else{
                              //middle rows
                              ///1*
                              System.out.print("* ");
                              for(int j = 1; j <= i-2; j++) {
                                  System.out.print(" ");
                              }
                              //1*
                              System.out.print("* ");
                          }
                          //move to next row
                      }
                      System.out.println();
        }
    }



