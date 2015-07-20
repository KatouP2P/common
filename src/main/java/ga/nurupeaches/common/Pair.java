package ga.nurupeaches.common;

public class Pair<L, R> {

    private L left;
    private R right;

    public Pair(L l, R r){
        left = l;
        right = r;
    }

    public void setLeft(L left){
        this.left = left;
    }

    public void setRight(R right){
        this.right = right;
    }

    public L getLeft(){
        return left;
    }

    public R getRight(){
        return right;
    }

}
