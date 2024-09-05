/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Rania Sutton
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int addedOne = add(3,4);
        System.out.println(addedOne);

        int addedTwo = add(1,2,3,4);
        System.out.println(addedTwo);

        String hello = morningGreeting("Rania Sutton");
        System.out.println(hello);

        String helloTwo = afternoonGreeting("Rania Sutton");
        System.out.println(helloTwo);

        String threeTimes = triple("wee");
        System.out.println(threeTimes);

        double divided = half(10);
        System.out.println(divided);

        int roundedOne = roundPositiveValueToNearestInteger(13.7);
        System.out.println(roundedOne);

        int roundedTwo = roundNegativeValueToNearestInteger(-7.3);
        System.out.println(roundedTwo);
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(add(a,b), add(c,d));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }


    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String input){
        return input+input+input;
    }

    // 6. half
    public static double half(double number){
        return number/2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double positive){
        return (int)(positive+0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double negative){
        return (int)(negative-0.5);
    }
}
