package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Point {
    private int x;
    private int y;

    // creates and initializes a point with given (x, y)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static int[] readInput() throws IOException {
        //input - table size
        System.out.println("Enter size of the table and starting position separated by comma");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num[] = new int[4];
        String[] strNums = bufferedReader.readLine().split("[,]", 0);
        for(int i=0; i<strNums.length; i++) {
            num[i] = Integer.parseInt(strNums[i]);
        }
        return num;
    }

    static int[] readCommands() throws IOException {
        //commands section
        System.out.println("0 = quit simulation & print result");
        System.out.println("1 = move forward one step");
        System.out.println("2 = move backwards one step");
        System.out.println("3 = rotate clockwise 90 degrees");
        System.out.println("4 = rotate counterclockwise 90 degrees");

        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        int numbers[] = new int[100];
        String[] strNumbers;

        strNumbers = buffReader.readLine().split("[,]", 0);
        for(int i=0; i<strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        return numbers;
    }

    static Point moveForward(Point pt){
        int objX1 = pt.x;
        int objY1 = pt.y - 1;
        Point pt1 = new Point(objX1, objY1);
        return pt1;
    }

    static Point moveBackwards(Point pt){
        int objX1 = pt.x;
        int objY1 = pt.y + 1;
        Point pt1 = new Point(objX1, objY1);
        return pt1;
    }

    static Point rotateClockWise(Point pt) {
        int objX1 = pt.y;
        int objY1 = -pt.x;
        Point pt1 = new Point(objX1, objY1);
        return pt1;
    }

    static Point rotateCounterCW1(Point pt) {
        int objX1 = -pt.y;
        int objY1 = pt.x;
        Point pt1 = new Point(objX1, objY1);
        return pt1;
    }

    static void printEndPosition(Point pt){
        System.out.println("[" + pt.x + "," + pt.y + "]");
    }
}
