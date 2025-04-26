public class Snake extends GameObj{
    private int Size;

    public Snake(){
        Size = 1;
    }

    public void onEat(){
        Size += 1;
    }
}