public abstract class CompoundExpression extends Expression {

    protected Expression _exNum1;
    protected Expression _exNum2;

    public CompoundExpression(Expression e1, Expression e2) {
        _exNum1 = e1;
        _exNum2 = e2;
    }

}
