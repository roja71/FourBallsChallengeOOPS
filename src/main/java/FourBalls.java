import processing.core.PApplet;

public class FourBalls extends  PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int widthOfCircle = 10;
    public static final int heightOfCircle = 10;
    FourBallsCircle[] circle = new FourBallsCircle[5];

    public static void main(String[] args){
        PApplet.main("FourBalls",args);
    }

    @Override
    public void setup() {
        super.setup();
        for(int i=1;i<=4;i++) {
            circle[i] = new FourBallsCircle(this,0,i*HEIGHT/5,widthOfCircle,heightOfCircle);
        }
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        DrawCircle drawCircle = new DrawCircle(this,circle);
        drawCircle.display();

    }
}