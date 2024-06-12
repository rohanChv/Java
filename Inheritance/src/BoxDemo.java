public class BoxDemo {
    public static void main(String[] args) {
        Box boxOne=new Box(2,4,6);
        BoxWeight boxWeightOne=new BoxWeight(boxOne,23);
        boxWeightOne.calculateVolume();
        BoxWeight boxWeightTwo=new BoxWeight(1,2,3);
        boxWeightTwo.calculateVolume();
    }
}
