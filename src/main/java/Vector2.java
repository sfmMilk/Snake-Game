public class Vector2{
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

    public Vector2 multiply(Vector2 other){
        Vector2 product = new Vector2();
        product.x = other.x * x;
        product.y = other.y * y;

        return product;
    }

    public Vector2 multiply(int number){
        Vector2 product = new Vector2();
        product.x *= number;
        product.y *= number;

        return product;
    }

    public boolean intersects(Vector2 other){
        return (x == other.x && y == other.y);
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}