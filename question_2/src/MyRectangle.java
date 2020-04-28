import java.awt.*;

public class MyRectangle extends MyBoundedShape {

    public MyRectangle(int x1, int x2, int y1, int y2, Color color, boolean isFill){
        super(x1,x2,y1,y2,color,isFill);
    }

    public MyBoundedShape clone(){
        MyBoundedShape b = new MyRectangle(x1,x2,y1,y2,color, _isFill);
        return b;
    }

    public void drawMe(Graphics g){
        g.setColor(color);
        if (_isFill){
            g.fillRect(x1,y1,x2,y2);
        }else {
            g.drawRect(x1, y1, x2, y2);
        }
    }
}
