public class AtomicExpression extends Expression {

    private double _atomicNum;

    public AtomicExpression (double atomic){
        _atomicNum = atomic;
    }

    public double calculate(){
        return _atomicNum;
    }

    public String toString(){
        String s = "";
        s = "" + _atomicNum ;
        return s;
    }

}
