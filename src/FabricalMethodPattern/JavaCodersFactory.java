package FabricalMethodPattern;

public class JavaCodersFactory implements CodersFactory {
    @Override
    public Coder createProgrammer() {
        return new JavaCoder();
    }
}
