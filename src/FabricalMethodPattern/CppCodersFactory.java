package FabricalMethodPattern;

public class CppCodersFactory implements CodersFactory {
    @Override
    public Coder createProgrammer() {
        return new CppCoder();
    }
}
