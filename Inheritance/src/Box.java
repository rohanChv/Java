public class Box {
    double height;
    double width;
    double depth;

    Box(){
        height=1.0;
        width=2.0;
        depth=4.0;
    }
    Box(double height,double width,double depth){
        this.depth=depth;
        this.width=width;
        this.height=height;
    }
    void calculateVolume(){
        System.out.println("Volume is "+(width*height*depth));
    }
}
