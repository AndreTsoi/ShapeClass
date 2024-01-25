public class Square extends Rectangle{

    public Square(String s, boolean b, double side) {
        super(s, b, side, side);
    }

    @Override
    public void setLength(double l) {
        super.setLength(l);
        super.setWidth(l);
    }

    @Override
    public void setWidth(double l){
        super.setLength(l);
        super.setWidth(l);
    }










}
