import apcslib.*;
public class House
{
    public static void main(String[]args)
    {
        DrawingTool marker;
        SketchPad pad;
        pad = new SketchPad(600,600);
        marker = new DrawingTool(pad);
        marker.up();
        marker.move(-150,-200);
        marker.turnRight(143);
        marker.move(300);
        marker.down();
        marker.turn(90);
        for (int i = 1; i < 5; i++)
        //loop to make square
        {
            marker.turn(90);
            marker.move(300);
        }
        marker.move(0,275);
        marker.move(150,100);
    }
}