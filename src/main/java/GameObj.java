import javax.swing.*;
import java.awt.*;

public class GameObj{
    private class Vector2{
        public int x;
        public int y;

        public Vector2(){
            x = 0;
            y = 0;
        }

        public Vector2(int _x, int _y){
            x = _x;
            y = _y;
        }

        public Vector2 add(Vector2 other){
            Vector2 sum = new Vector2();
            sum.x = other.x + x;
            sum.y = other.y + y;

            return sum;
        }

        public boolean intersects(Vector2 other){
            return (x == other.x && y == other.y);
        }

        @Override
        public String toString(){
            return "(" + x + ", " + y + ")";
        }
    }

    public Vector2 Position;
    public Vector2 Direction;

    private Color Color;

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