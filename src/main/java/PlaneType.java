public enum Plane {

    BOEING747(416, 183500);

    private int capacity;
    private int totalWeight;

    Plane(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }
}
