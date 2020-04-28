import java.awt.*;

public class Myline extends MyShape  {

    public Myline (int x1, int x2, int y1, int y2, Color color) {
        super(x1, x2, y1, y2, color);
    }

    public MyShape clone (){
        MyShape a = new Myline(x1,x2, y1, y2,color);
        return a;
    }

    public void drawMe(Graphics g){
        g.setColor(color);
        g.drawLine(x1,y1,x2,y2);
    }

    private double calculateLine (){
        double d;
        d= Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        return d;
    }

    public boolean equals (Myline line){
        if (this.calculateLine() == line.calculateLine()){
            return true;
        }
        return false;

    }

}
