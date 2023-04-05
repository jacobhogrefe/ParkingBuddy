public class ParkingSpace {
    private boolean handicappedSpace;
    private boolean isSpaceFull;
    private int spaceLocation;

    public ParkingSpace(int location){
        this.handicappedSpace = false;
        this.isSpaceFull = false;
        this.spaceLocation = location;
    }
    public ParkingSpace(int location, String handicap){ //This is for handicapped spaces
        this.handicappedSpace = true;
        this.isSpaceFull = false;
        this.spaceLocation = location;
    }
    public boolean isHandicappedSpace() {
        return handicappedSpace;
    }
    public void setHandicappedSpace(boolean handicappedSpace) {
        this.handicappedSpace = handicappedSpace;
    }
    public String isSpaceFull() {
        if(isSpaceFull){
            return "Taken";
        }
        else {
            return "Open";
        }
    }
    public void setSpaceFull(boolean isSpaceFull) {
        this.isSpaceFull = isSpaceFull;
    }
    public int getSpaceLocation() {
        return spaceLocation;
    }
    public void setSpaceLocation(int spaceLocation) {
        this.spaceLocation = spaceLocation;
    }
}
