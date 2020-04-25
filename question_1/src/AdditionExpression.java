public class AdditionExpression extends CompoundExpression {

    public AdditionExpression(Expression ex1 , Expression ex2){
        super(ex1,ex2);
    }

    public double calculate(){
        double res = 0;
        res = _exNum1.calculate() + _exNum2.calculate();
        return res ;

    }
    public String toString(){
        String s = _exNum1.toString() + " + " + _exNum2.toString();
        return s;
    }
}
