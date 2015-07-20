package ga.nurupeaches.common;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * A simple work around to returning a Future where there is really no future operation.
 * @param <V>
 */
// also can be used to describe my future... [cries internally]
public class NoFuture<V> implements Future<V> {

    private final V value;

    public NoFuture(V value){
        this.value = value;
    }

    @Override
    public V get() throws InterruptedException, ExecutionException{
        return value;
    }

    @Override
    public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException{
        return value;
    }

    @Override
    public boolean isCancelled(){
        return false;
    }

    @Override
    public boolean isDone(){
        return true;
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning){
        return false;
    }
}
