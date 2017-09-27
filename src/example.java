import java.awt.*;
public class example {
    // so I can use Graphics
    public static void main(String[] args) {
        DrawingPanel checkerboard = new DrawingPanel(240, 240);
        Graphics blackSquare = checkerboard.getGraphics();
        checkerboard.setBackground(Color.red);

        int LeftCornerX;
        int LeftCornerY;

        for (LeftCornerY = 0; LeftCornerY < 240; LeftCornerY = LeftCornerY + 60) {
            for (LeftCornerX = 0; LeftCornerX < 240; LeftCornerX = LeftCornerX + 60) {
                blackSquare.setColor(Color.black);
                blackSquare.fillRect(LeftCornerX, LeftCornerY, 30, 30);
            }
        }
        for (LeftCornerY = 30; LeftCornerY < 240; LeftCornerY = LeftCornerY + 60) {
            for (LeftCornerX = 30; LeftCornerX < 240; LeftCornerX = LeftCornerX + 60) {
                blackSquare.setColor(Color.black);
                blackSquare.fillRect(LeftCornerX, LeftCornerY, 30, 30);
            }
        }
        Graphics face = checkerboard.getGraphics();
        Graphics mouth = checkerboard.getGraphics();
        Graphics eye1 = checkerboard.getGraphics();
        Graphics eye2 = checkerboard.getGraphics();
placeSmiley(face,eye1,eye2,mouth);
    }
    public static void dSmiley(Graphics face ,Graphics mouth, Graphics eye2, Graphics eye1 , int topleftCornerY,int topleftCornerX) {
        face.setColor(Color.YELLOW);
        face.fillOval(topleftCornerX, topleftCornerY, 25, 25);
        eye1.setColor(Color.BLACK);
        eye1.fillOval(topleftCornerX+8, topleftCornerY+8, 3, 4);
        eye2.fillOval(topleftCornerX+15, topleftCornerY+8, 3, 4);
        eye2.drawArc(topleftCornerX+5, topleftCornerY+7, 15, 15, 210, 120);

    }
    public static void placeSmiley(Graphics face ,Graphics mouth, Graphics eye1, Graphics eye2){
        int topleftcornerX;
        int topleftcornerY;
        for(topleftcornerY = 2 ; topleftcornerY < 240; topleftcornerY = topleftcornerY+180){
            for(topleftcornerX =2 ; topleftcornerX <240; topleftcornerX= topleftcornerX+60){
                dSmiley(face,eye1,eye2,mouth,topleftcornerY,topleftcornerX);
            }
            for ( topleftcornerY =32; topleftcornerY<240;topleftcornerY=topleftcornerY+180){
                for(topleftcornerX=32;topleftcornerX <240;topleftcornerX=topleftcornerX+60){
                    dSmiley(face,eye1,eye2,mouth,topleftcornerY,topleftcornerX);
                }
            }

        }
    }
}









