public class LambdaExpressions {

    private static String GREETING = "Hello ";

    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;
        MathOperation subtraction = (a, b) -> a - b;

        System.out.println(operate(10, 5, addition));
        System.out.println(operate(10, 5, multiplication));
        System.out.println(operate(10, 5, division));
        System.out.println(operate(10, 5, subtraction));

        String localString = ", Welcome";

        GreetingService greetingService1 = message -> System.out.println(GREETING + message + localString);

        GreetingService greetingService2 = message -> {
            System.out.println(GREETING + "there" + localString);
            System.out.println("My name is " + message);
        };

        //localString = ", new message";    this will create a compilation error while trying to edit local variables used in lambda expression because they should be in final or effectively final

        greetingService1.sayMessage("Amr");
        greetingService2.sayMessage("Mido");
    }

    private static double operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

}
