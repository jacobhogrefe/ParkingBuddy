public class ParkingSpace 
{
    private String priority;
    private boolean isSpaceFull;

    public ParkingSpace(String priority, boolean isSpaceFull)
    {
        this.priority = priority;
        this.isSpaceFull = isSpaceFull;
    }

    public String getPriority() 
    {
        return priority;
    }

    public void setPriority(String priority) 
    {
        this.priority = priority;
    }

    public String isSpaceFull() 
    {
        return isSpaceFull ? "Taken" : "Open";
    }

    public boolean spaceFilled() {
        return isSpaceFull;
    }

    public void setSpaceFull(boolean isSpaceFull) 
    {
        this.isSpaceFull = isSpaceFull;
    }
}
