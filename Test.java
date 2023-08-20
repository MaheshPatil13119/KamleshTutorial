import org.w3c.dom.ls.LSOutput;

public class Test extends Best {


    public static void method1(){
        System.out.println("m1 static Method");
    }

    public void m2(){
        System.out.println("m2 non-static Method");
    }

    public Test(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        // Data Structures

//        int hours = 5;
//
//        String name = "Mahesh";
//        Float f = 0.5F;
//        Double d = 1.5;
//        Boolean b = true;
//
//        int[] arr = {10, 20, 30, 40, 50,60, 70, 80};
//        String[] s = {"Mahesh", "Patil"};

        // If-else Block=====================================================

//        if(hours <= 4){
//            System.out.println("half day leave");
//        }else {
//            System.out.println("full day leave");
//        }

        // For Loop===============================================================

//        System.out.println("Array Size is ="+arr.length);
//        for(int i = arr.length-1; i >=0; i-- ) {
//            System.out.println(arr[i]);
//        }

//        for(int i: arr){
//            System.out.println(i);
//        }

        // Star Pattern Program==================================================

        //  *****

//        for(int i =1; i<=4; i++){
//            for(int j=1 ; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i =1; i<=4; i++){
//            for(int j=4 ; j>=i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //Methods - we can't call non static method in to static method without crating object
        // Constructor will execute every time when the class object is get created

//        Test t = new Test();
//        Test t1 = new Test();
//        Test t2 = new Test();
//        Test t3 = new Test();
//        t.m2();

//        String m1 = "Mahesh";
//        String p1 = "Patil";
//
//        System.out.println(m1);
//        System.out.println(m1.charAt(2));
//        System.out.println(m1.indexOf("s"));
//        System.out.println(m1.toUpperCase());
//        System.out.println(m1+ " " +p1);
//        System.out.println(m1.concat(p1));
//
//
//        for(int i = 0; i<m1.length(); i++){
//            System.out.println(m1.charAt(i));
//        }


        // Data Conversion

//        String m1 = "10";
//        int i = 20;
//        System.out.println(i+m1);
//        int ii = Integer.parseInt(m1);     // String to Integer
//        Float f = (float)ii;               // Integer to FLoat
//        System.out.println(f);











    }
}
