package Programs.StringExamples.Basics;
import java.lang.Object;

class Box {

    int length;
    int width;
    int height;

    public Box(int i, int i1, int i2) {
        length = i;
        width = i1;
        height = i2;
    }

    public String toString(){
        return " This is returned";
    }

}

class toStringDemo{
    public static void main(String[] args) {
        Box b = new Box(10,20,30);
        System.out.println(b);
    }
}