package w33;

public class Rectangle {
    private int width;
    private int height;
    public Rectangle (){
        super();
    };
    public Rectangle (int width, int height){
        this.width = width;
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
}
