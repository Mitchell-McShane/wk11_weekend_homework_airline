public class Plane {

    private PlaneType planeType;

    Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public int getCapacity(){
        return this.planeType.getCapacity();
    }

    public int getTotalWeight(){
        return this.planeType.getTotalWeight();
    }
}
