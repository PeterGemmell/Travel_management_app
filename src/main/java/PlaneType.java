public enum PlaneType {

    BOEING747(660,183500);


    private final int planeCapacity; private final int planeWeight;
    PlaneType(int planeCapacity, int planeWeight){
        this.planeCapacity = planeCapacity;
        this.planeWeight = planeWeight;
    }

    public int getPlaneCapacity() {
        return this.planeCapacity;

    }

    public int getPlaneWeight(){
        return this.planeWeight;
    }

}


