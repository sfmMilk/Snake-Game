import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

public class Board extends JPanel{
    public final int ROWS = 20;
    public final int COLS = 20;
    public final int TILE_SIZE = 20; // Each tile = 20x20 pixels
    public final int BOARD_WIDTH = COLS * TILE_SIZE;
    public final int BOARD_HEIGHT = ROWS * TILE_SIZE;

    Snake snake = new Snake();
    
    public Board(){
        this.setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.GRAY);
        for(int row = 0; row <= ROWS; row++){
            g.drawLine(0, row * TILE_SIZE, BOARD_WIDTH, row * TILE_SIZE);
        }

        for(int col = 0; col <= COLS; col++){
            g.drawLine(col * TILE_SIZE, 0, col * TILE_SIZE, BOARD_HEIGHT);
        }


        g.setColor(snake.Color);
        Vector2 pixelLocation = snake.Position.multiply(TILE_SIZE);
        g.fillRect(pixelLocation.x, pixelLocation.y, TILE_SIZE, TILE_SIZE);

    }
}