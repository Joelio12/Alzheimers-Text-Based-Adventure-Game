package anonymous.Mechanics;

import anonymous.Player.Player;
import anonymous.Room.Room;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by joelvalentine on 11/03/2016.
 */
public class GameEngine {

    private Map<Integer, Room> allRooms = new HashMap<>();

    public GameEngine(Player player) {

    }

    public void instructions(){
        System.out.println("T \n");
    }

    public void addToRooms(Room tr){
        allRooms.put(allRooms.size(), tr);
    }

    public Map<Integer, Room> getAllRooms() {
        return allRooms;
    }

    public void run(Player player) {
        player.setGlobalLocation(allRooms.get(0));
        System.out.println(player.getGlobalLocation().getContext());
//        player.getGlobalLocation().getPointsInRoom().get("C").encountered(player, this);
        while(!player.isAlive()){
            player.move(this);
        }
    }
}