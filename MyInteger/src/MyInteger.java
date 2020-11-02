
/*****************************************************
* Name: Feras
* Description: A program that takes primitive type values and check if it is 
* even? odd? and if they are equal to each other
 ***************************************************/

public class MyInteger {
    //private to it doesn't change
   private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //method to check if int value in MyInteger is even
    public boolean isEven() {
        return value % 2 == 0;
    }
    
    //method to check if int value stored in MyInteger is odd
    public boolean isOdd() {
        return !isEven();
    }

    //if the remainder is = 0 then its even
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    //method to check if value is odd or not
    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    //method to check if value is even or not
    public static boolean isEven(MyInteger mI) {
        return mI.isEven();
    }//end isEven
    
    //method to check if value is odd or not
    public static boolean isOdd(MyInteger mI) {
        return mI.isOdd();
    }//end isOdd method

    public boolean equals(int value) {
        return this.value == value;
    }//end equals method with primitive val

    public boolean equals(MyInteger mI) {
        return this.value == mI.value;
        
    }//end equals method with ref val
} //end class
