import java.awt.*;

public class MyOval extends MyBoundedShape {

    public MyOval (int x1, int x2, int y1, int y2, Color color, boolean isFill){
        super(x1,x2,y1,y2,color,isFill);
    }

    public MyBoundedShape clone(){
        MyBoundedShape b = new MyOval(x1,x2,y1,y2,color, _isFill);
        return b;
    }

    public void drawMe(Graphics g){
        g.setColor(color);
        if (_isFill){
            g.fillOval(x1,y1,x2,y2);
        }else {
            g.drawOval(x1, y1, x2, y2);
        }
    }

}
