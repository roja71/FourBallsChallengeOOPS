public class IncrementXAxis {
    private FourBallsCircle[] circles;

    public IncrementXAxis(FourBallsCircle[] circles) {
        this.circles = circles;
    }
    public void increment(){
        for(int i=1;i<=4;i++){
            this.circles[i].setxAxisPosition(this.circles[i].getxAxisPosition()+i);
        }
    }
}