import javax.swing.JFrame;
public class Main{
    public static void main(String[] args){
        JFrame windowFrame = new JFrame("Snake Game");
        Board gameBoard = new Board();

        windowFrame.add(gameBoard);
        windowFrame.pack();
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setLocationRelativeTo(null);
        windowFrame.setVisible(true);
    }
}