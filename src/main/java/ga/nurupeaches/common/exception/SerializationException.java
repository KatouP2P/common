package ga.nurupeaches.common.exception;

public class SerializationException extends RuntimeException {

    public SerializationException(String s, Throwable t){
        super(s, t);
    }

    public SerializationException(Throwable t){
        super(t);
    }

    public SerializationException(){
        super();
    }

}
