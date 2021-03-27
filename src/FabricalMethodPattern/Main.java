package FabricalMethodPattern;

public class Main {
    public static void main(String[] args) {
        CodersFactory codersFactory = createCoderBySpecialty("Java");
        Coder coder = codersFactory.createProgrammer();
        coder.writeCode();
    }

    static CodersFactory createCoderBySpecialty(String specialty) {

        switch (specialty) {
            case "Java": return new JavaCodersFactory();
            case "C++": return new CppCodersFactory();
            default: throw new RuntimeException(specialty + " - нууу, это не серьезно!");
        }

    }

}
