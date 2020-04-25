public abstract class Expression {
    public abstract double calculate();



    public boolean equals (Expression expression){
        double res=0;
        res = expression.calculate();
        double res2=0;
        res2 = this.calculate();
        if (res2 == res){
            return  true;
        }
        return false;


    }
}
