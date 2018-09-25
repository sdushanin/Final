/**
 * Created by Stas on 25.09.2018.
 */

//Добавляем класс для исключения при делении на ноль
public class ZeroException extends Exception {
    public ZeroException(String message) {
        super(message);
    }
}
