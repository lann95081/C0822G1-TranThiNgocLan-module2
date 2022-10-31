package ss19_string_regex.exercise.validate_name_class;

public class TestNameClassExample {
    public static NameClassExample nameClassExample;

    public static final String[] validNameClass = new String[] {"C0318G"};
    public static final String[] invalidNameClass = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        nameClassExample = new NameClassExample();
        for (String name : validNameClass) {
            boolean isValid = nameClassExample.isvalid(name);
            System.out.println("Name class is " + name + " is valid: " + isValid);
        }
        for (String nameClass : invalidNameClass) {
            boolean isValid = nameClassExample.isvalid(nameClass);
            System.out.println("Name class is " + nameClass + " is valid: " + isValid);
        }
    }
}
