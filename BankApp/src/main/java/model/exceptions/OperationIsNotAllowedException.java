package model.exceptions;

/**
 * Created by Krzysztof Podlaski on 04.03.2018.
 */
public class OperationIsNotAllowedException extends Exception{
    public OperationIsNotAllowedException(String msg) {
        super(msg);
    }
}
