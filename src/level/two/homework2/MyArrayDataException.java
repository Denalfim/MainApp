package level.two.homework2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException (int i, int j){
        super("Не удалось преобразовать элемент к числу (" + i + " , " + j + ")");
    }
}
