//package ActivityStarterCode.train;
//
//import comp127graphics.CanvasWindow;
//import comp127graphics.Ellipse;
//import comp127graphics.Line;
//import comp127graphics.Rectangle;
//
//import java.awt.*;
//
//
///*
// * File: TrainDrawer.java
// * --------------------
// * This program draws a three-car train consisting on an engine,
// * a boxcar, and a caboose.  This implementation of the program,
// * however, is incomplete, and contains only the methods given
// * in the text.
// */
//
//public class TrainDrawer {
//
//    /* Dimensions of the door panels on the boxcar */
//    public static final double DOOR_WIDTH = 18*SCALE;
//    public static final double DOOR_HEIGHT = 32*SCALE;
//
//    /* Dimensions of the cupola (the rectangular piece on the top of the caboose) */
//    public static final double CUPOLA_WIDTH = 35*SCALE;
//    public static final double CUPOLA_HEIGHT = 8*SCALE;
//
//    // Instance variable for the canvas that you can add shapes to in order to have them be drawn.
//    private CanvasWindow canvas;
//
//
//    public static void main(String[] args) {
//        TrainDrawer drawer = new TrainDrawer();
//    }
//
//    public TrainDrawer(){
//
//        Engine engine = new Engine(Color.BLACK);
//        canvas.add(engine);
//        canvas.add(engine,TrainCar.CAR_WIDTH,TrainCar.CAR_HEIGHT);
//
//
//
//        //Create a window and canvas to draw on
//        canvas = new CanvasWindow("Train", 800, 500);
//
//        double trainWidth = 3 * TrainCar.CAR_WIDTH + 4 * TrainCar.CONNECTOR;
//        double x = (canvas.getWidth() - trainWidth) / 2;
//        double y = canvas.getHeight();
//        double dx = TrainCar.CAR_WIDTH + TrainCar.CONNECTOR;
//        //drawEngine(x, y);
////        drawBoxcar(x + dx, y, Color.GREEN);
////        drawCaboose(x + 2 * dx, y);
//    }
//
////
////
////    /* Draws a boxcar in the specified color */
////    private void drawBoxcar(double x, double y, Color color) {
////        drawCarFrame(x, y, color);
////        double xRight = x + CONNECTOR + CAR_WIDTH / 2;
////        double xLeft = xRight - DOOR_WIDTH;
////        double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
////        canvas.add(new Rectangle(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
////        canvas.add(new Rectangle(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
////    }
////
////    /* Draws a red caboose */
////    private void drawCaboose(double x, double y) {
////        drawCarFrame(x,y, Color.RED);
////        drawCupola(x,y);
////    }
////
////    private void drawCupola(double x, double y) {
////        double xLeft = x + CONNECTOR+CAR_WIDTH/2-CUPOLA_WIDTH/2;
////        double yTop = y - CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT;
////        Rectangle cupola = new Rectangle(xLeft, yTop, CUPOLA_WIDTH, CUPOLA_HEIGHT);
////        cupola.setFillColor(Color.RED);
////        cupola.setFilled(true);
////        canvas.add(cupola);
////    }
////
////
////
////
////
//}