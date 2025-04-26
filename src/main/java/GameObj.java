import javax.swing.*;
import java.awt.*;

public class GameObj{
    public Vector2 Position;
    public Vector2 Direction;

    public Color Color;

    public GameObj(){
        Position = new Vector2();
        Direction = new Vector2();

        Color = new Color(0, 0, 0);
    }

    public GameObj(Vector2 _Position, Vector2 _Direction, Color _Color){
        Position = _Position;
        Direction = _Direction;
        Color = _Color;
    }

    public boolean intersects(GameObj Object){
        return Position.intersects(Object.Position);
    }

    public void MoveTo(Vector2 newPosition){
        Position = newPosition;
    }

    public void MoveBy(Vector2 offset){
        Position = Position.add(offset);
    }

    public void SetDirection(Vector2 newDirection){
        Direction = newDirection;
    }

}