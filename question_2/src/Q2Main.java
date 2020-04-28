import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Q2Main extends JPanel{

    private static final int MIN = 0;
    private static final int MAX = 200;
    private static ArrayList<MyShape> list1 = new ArrayList<MyShape>();
    private static ArrayList<MyShape> list2 = new ArrayList<MyShape>();

    public void paintComponent(Graphics g){
        for(int i=0 ; i<list1.size() ; i++){
            MyShape s;
            s=list1.get(i);
            s.drawMe(g);
        }

        for(int j=0 ; j<list2.size() ; j++){
            MyShape s;
            s=list2.get(j);
            s.drawMe(g);
        }
    }

    public static void main(String[] args) {
        list1 = createShapes();

        for ( int i=0 ; i<list1.size() ; i++){
            MyShape shape;
            shape = list1.get(i);
            list2.add(shape.clone());
        }

        for (int i=0; i<list2.size() ; i++){
            MyShape s;
            s= list2.get(i);
            s.setX1(s.getX1()+10);
            s.setY1(s.getY1()+10);
            s.setColor(Color.green);
            if(s instanceof MyBoundedShape){
               ((MyBoundedShape) s).set_isFill(false);
            }
        }

        JFrame frame = new JFrame("MyShape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        Q2Main gui = new Q2Main();
        frame.add(gui);
        frame.setVisible(true);


    }


    private static ArrayList<MyShape> createShapes(){
        ArrayList<MyShape> shapeList = new ArrayList<MyShape>();
        Myline l1 = new Myline(getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber(), Color.red);
        Myline l2 = new Myline(getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber(), Color.red);

        MyRectangle r1 = new MyRectangle(getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber(),Color.red,true);
        MyRectangle r2 = new MyRectangle(getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber(),Color.red,true);

        MyOval o1 = new MyOval(getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber(),Color.red,true);
        MyOval o2 = new MyOval(getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber(),Color.red,true);

        shapeList.add(l1);
        shapeList.add(l2);
        shapeList.add(r1);
        shapeList.add(r2);
        shapeList.add(o1);
        shapeList.add(o2);

        return shapeList;
    }

    private static int getRandomNumber(){
        Random random = new Random();
        int r;
        r =(random.nextInt((MAX - MIN)+1)+MIN);
        return r;
    }

}
