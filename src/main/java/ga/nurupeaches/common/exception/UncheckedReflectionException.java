package ga.nurupeaches.common.exception;

public class UncheckedReflectionException extends RuntimeException {

    public UncheckedReflectionException(String s, Throwable t){
        super(s, t);
    }

    public UncheckedReflectionException(Throwable t){
        super(t);
    }

    public UncheckedReflectionException(){
        super();
    }

}
