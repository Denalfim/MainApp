package level.two.homework2;

public class MyArraySizeException extends  IndexOutOfBoundsException {
    public MyArraySizeException() {
        super("Массив должен быть 4 х 4");
    }
}
