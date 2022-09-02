import processing.core.PApplet;

public class FourBallsCircle{
    private int xAxisPosition;
    private int yAxisPosition;
    private int widthOfCricle;
    private int heightOfCircle;
    PApplet sketch;

    public FourBallsCircle(PApplet fourBalls, int xAxisPosition, int yAxisPosition, int widthOfCricle, int heightOfCircle) {
        this.xAxisPosition = xAxisPosition;
        this.yAxisPosition = yAxisPosition;
        this.widthOfCricle = widthOfCricle;
        this.heightOfCircle = heightOfCircle;
        this.sketch = fourBalls;
    }

    public int getxAxisPosition() {
        return xAxisPosition;
    }

    public int getyAxisPosition() {
        return yAxisPosition;
    }

    public int getWidthOfCricle() {
        return widthOfCricle;
    }

    public int getHeightOfCircle() {
        return heightOfCircle;
    }

    public void setxAxisPosition(int xAxisPosition) {
        this.xAxisPosition = xAxisPosition;
    }

}