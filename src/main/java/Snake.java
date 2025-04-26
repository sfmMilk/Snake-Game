import java.awt.*;

public class Snake extends GameObj{
    private int Size;

    public Snake(){
        Color = Color.RED;
        Size = 1;
    }

    public Snake(Color _Color){
        Color = _Color;
        Size = 1;
    }

    public void onEat(){
        Size += 1;
    }
}