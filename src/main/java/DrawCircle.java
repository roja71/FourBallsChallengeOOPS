import processing.core.PApplet;

public class DrawCircle {
    FourBallsCircle[] circle;
    PApplet sketch;
    IncrementXAxis incrementObject;
    public DrawCircle(PApplet sketch,FourBallsCircle[] circle) {
        this.circle = circle;

        this.sketch =  sketch;

        incrementObject = new IncrementXAxis(circle);
    }

    public void display(){

        for(int i=1;i<=4;i++){
            sketch.ellipse(this.circle[i].getxAxisPosition(),this.circle[i].getyAxisPosition(), this.circle[i].getWidthOfCricle(),this.circle[i].getHeightOfCircle());
        }
        incrementObject.increment();
    }
