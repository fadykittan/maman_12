import java.awt.*;

public abstract class MyBoundedShape extends MyShape {
    protected boolean _isFill;

    public MyBoundedShape(int x1, int x2, int y1, int y2, Color color, boolean isFill){
        super(x1,x2,y1,y2,color);
        this._isFill = isFill;
    }

    public boolean get_isFill(){return _isFill;}

    public void set_isFill(boolean isFill){
        this._isFill = isFill;
    }

    public boolean equals (MyBoundedShape boundedShape) {
        if (this.x2 == boundedShape.x2 && this.y2 == boundedShape.y2) {
            return true;
        }
        return false;
    }

}
