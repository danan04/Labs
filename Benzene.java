import apcslib.*;
public class Benzene
{
    public static void main(String[]args)
    {
        DrawingTool marker;
        SketchPad pad;
        pad = new SketchPad(600,600);
        marker = new DrawingTool(pad);
        marker.drawCircle(150);
        marker.up();
        marker.turnRight(90);
        marker.move(200);
        marker.down();
        marker.turn(60);
        for (int i = 1; i < 7; i++)
        //loop to make hexagon
        {
            marker.turn(60);
            marker.move(200);
        }
    }
}