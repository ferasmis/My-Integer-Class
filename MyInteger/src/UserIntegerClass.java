/*****************************************************
* Name: Feras
* Description: A program that takes primitive type values and check if it is 
* even? odd? and if they are equal to each other
 ***************************************************/

//this class is to display to the user
public class UserIntegerClass {
    public static void main(String[] args) {
        //object reference variables to store the int values
        MyInteger n1 = new MyInteger(5);
        MyInteger n2 = new MyInteger(24);
              
        //Display the values with answers to the user
       
        System.out.println("n1 = "+ n1.getValue()
                + ", n1 is even? " + n1.isEven());
        
        System.out.println("n2 = " + n2.getValue() + 
                 ", n2 is odd? " + n2.isOdd());
        
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        
        System.out.println("20 is even? " + MyInteger.isEven(20));

        System.out.println( "n1 = " + n1.getValue() +" ,n1 is odd? " +
                n1.isOdd());
                
        System.out.println( "n2 = " + n2.getValue() +" ,n2 is even? " +
                n2.isEven());

        System.out.println("n1 is equal to n2? " + n1.equals(n2));
          
        System.out.println("n1 is equal to " + n1.getValue() +"? " 
                  + n1.equals(n1));
          
    }
}
