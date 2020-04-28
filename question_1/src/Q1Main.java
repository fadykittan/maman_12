import java.util.ArrayList;
import java.util.Random;


public class Q1Main {

    private static final int FROM = 1;
    private static final int TO = 100;

    public static void main(String[] args) {
        ArrayList<Expression> expressionsList = getExpressionList();
        for (Expression e : expressionsList){
            System.out.println(e + " = " + e.calculate());
        }

        System.out.println("\t");
        System.out.println("checking for equal Expressions...");
        System.out.println("\t");

        for (int i=0 ; i<expressionsList.size() ; i++){
            Expression x ;
            Expression y;
            x = expressionsList.get(i);
            for (int j= i+1 ; j < expressionsList.size() ; j++){
                y = expressionsList.get(j);
                if (x.equals(y)){
                    System.out.println("this Expressions are equals: " + x + " = " + y);
                }

            }


        }

    }

    private static ArrayList<Expression> getExpressionList(){
        Random random = new Random();
        ArrayList<Expression> expressionsList = new ArrayList<Expression>();
        Expression e1 = new AtomicExpression(random.nextInt((TO - FROM)+1)+FROM);
        Expression e2 = new AtomicExpression(random.nextInt((TO - FROM)+1)+FROM);
        Expression e3 = new AtomicExpression(random.nextInt((TO - FROM)+1)+FROM);
        Expression e4 = new AtomicExpression(random.nextInt((TO - FROM)+1)+FROM);
        Expression e5 = new AtomicExpression(random.nextInt((TO - FROM)+1)+FROM);
        Expression e6 = new AtomicExpression(random.nextInt((TO - FROM)+1)+FROM);

        AdditionExpression ae1 = new AdditionExpression(e1,e2);
        AdditionExpression ae2 = new AdditionExpression(e5,e3);
        AdditionExpression ae3 = new AdditionExpression(e6,e2);
        AdditionExpression ae4 = new AdditionExpression(ae1,ae2);
        AdditionExpression ae5 = new AdditionExpression(ae2,ae3);
        AdditionExpression ae6 = new AdditionExpression(ae1,ae3);

        SubtractionExpression se1 = new SubtractionExpression(e1 , e2);
        SubtractionExpression se2 = new SubtractionExpression(e5 , e6);
        SubtractionExpression se3 = new SubtractionExpression(e4 , e3);
        SubtractionExpression se4 = new SubtractionExpression(se1 , se2);
        SubtractionExpression se5 = new SubtractionExpression(se2 , se3);
        SubtractionExpression se6 = new SubtractionExpression(se1 , se3);

        SubtractionExpression se7 = new SubtractionExpression(ae4 , se4);
        AdditionExpression ae7 = new AdditionExpression(ae5,se5);
        SubtractionExpression se8 = new SubtractionExpression(ae5 , se5);
        AdditionExpression ae9 = new AdditionExpression(ae6,se6);

        SubtractionExpression se10 = new SubtractionExpression(ae7 , se7);
        AdditionExpression ae11 = new AdditionExpression(ae9,se8);

        expressionsList.add(e1);
        expressionsList.add(e2);
        expressionsList.add(e3);
        expressionsList.add(e4);
        expressionsList.add(e5);
        expressionsList.add(e6);

        expressionsList.add(ae1);
        expressionsList.add(ae2);
        expressionsList.add(ae3);
        expressionsList.add(ae4);
        expressionsList.add(ae5);
        expressionsList.add(ae6);
        expressionsList.add(ae7);
        expressionsList.add(ae9);
        expressionsList.add(ae11);

        expressionsList.add(se1);
        expressionsList.add(se2);
        expressionsList.add(se3);
        expressionsList.add(se4);
        expressionsList.add(se5);
        expressionsList.add(se6);
        expressionsList.add(se7);
        expressionsList.add(se8);
        expressionsList.add(se10);

        return expressionsList;
    }

}
