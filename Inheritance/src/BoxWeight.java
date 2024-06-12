public class BoxWeight extends Box{
    double weight=0.0;
    BoxWeight(Box b,double weight){
    this.width= b.width;
    this.depth=b.depth;
    this.height=b.height;
    this.weight=weight;
    }
    //Demo Of Super
    BoxWeight(double width,double height,double depth){
        super(height,width,depth);
        this.weight=100;
    }
}
