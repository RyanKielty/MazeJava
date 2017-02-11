package com.theironyard;

/**
 * Created by ryankielty on 1/18/17.
 */
public class Room {
    int row;
    int col;
    boolean wasVisited = false;
    boolean hasBottom = true;
    boolean hasRight = true;
    boolean theStart = false;
    boolean theEnd = false;

    public Room(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
