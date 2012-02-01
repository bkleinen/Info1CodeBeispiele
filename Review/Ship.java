import java.util.*;
public class Ship
{
    List<Location> history = new ArrayList<Location>();
    private  Location hafen;
    public Location getLocation(){
        return hafen;}

    public void setLocation(Location hafen){
        this.hafen=hafen;
        history.add(hafen);
    }
}
