package Box;
public class box{
    public static void main(String args[]){
     Pen p1 = new Pen();
     p1.name = "montex";
     p1.color = "blue";
     p1.tipsize = 10;
     System.out.print(p1.name+"\n"+p1.color+"\n"+p1.tipsize);
    }
}
class Pen{
    String name;
    String color;
    int tipsize;
    Pen(){
        System.out.println("this is a constructor");
    }
    void changecolor(String newcolor){
        color = newcolor;
    }
}