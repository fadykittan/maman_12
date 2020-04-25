public class SubtractionExpression extends CompoundExpression {

    public SubtractionExpression(Expression e1, Expression e2){
        super(e1,e2);
    }

    public double calculate(){
        double res =0 ;
        res = _exNum1.calculate() - _exNum2.calculate();
        return res;
    }

    public String toString(){
        String s = _exNum1.toString() + " - " + _exNum2.toString();
        return s;
    }
}
