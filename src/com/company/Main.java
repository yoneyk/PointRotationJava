package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] num = Point.readInput();
        Point point = new Point(num[2],num[3]);
        int[] numbers = Point.readCommands();

        // can be taken into another function
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                Point.printEndPosition(point);
                break;
            }
            else if (numbers[i] == 1) { // move forward 1 step
                Point pt = Point.moveForward(point);
                point = pt;
            }
            else if (numbers[i] == 2) { // move backwards 1 step
                Point pt = Point.moveBackwards(point);
                point = pt;
            }
            else if (numbers[i] == 3) { // clockwise 90 degrees
                Point pt = Point.rotateClockWise(point);
                point = pt;
            }
            else if (numbers[i] == 4) { // counter clockwise 90 degrees
                Point pt = Point.rotateCounterCW1(point);
                point = pt;
            }
            else {
                System.out.println("No operation");
            }
        }
    }
}
