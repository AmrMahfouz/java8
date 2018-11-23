import java.util.Arrays;
import java.util.List;

public class MethodReferences {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amr ", "Mido ", "Nour ", "Ghada ", "Kamilia");
        names.forEach(System.out::print);
        System.out.println();

        PrintName printName = new PrintName();
        names.forEach(printName::print);
        System.out.println();

        names.forEach(PrintName::printStatic);
        System.out.println();

        names.forEach(PrintName::new);
    }

    static class PrintName {

        public PrintName() {

        }

        public PrintName(String name) {
            System.out.print(name);
        }

        public void print(String name) {
            System.out.print(name);
        }

        public static void printStatic(String name) {
            System.out.print(name);
        }

    }

}
