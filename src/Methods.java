public class Methods  {
    //declaration and definition
//    static void print2kaTable(){
//        for(int i = 1; i<=10; i++){
//            int ans= 2*i;
//            System.out.println("2*1 = "+ ans);
//        }
//    }

    static int add(int p, int q){
        int sum = p+q;
        return sum;
    }

    static float add(float p, float q){
        float sum = p+q;
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println("Hi");
//        print2kaTable();
//        System.out.println("Bye");
          int ans1 = add(1, 2);
          float ans2 = add(1, 2);
          System.out.println("ans1: "+ ans1);
          System.out.println("ans2:" + ans2);

    }
}
