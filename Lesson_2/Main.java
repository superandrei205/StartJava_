public class Main {
    public static void main(String[] args) {
        NonBooleanMethods nonBooleanMethods = new NonBooleanMethods();
        BooleanMethods booleanMethods = new BooleanMethods();
        Methods methods = new Methods();

        methods.callNonBooleanMethods(nonBooleanMethods);
        System.out.println();

        methods.callBooleanMethods(booleanMethods);
    }
}