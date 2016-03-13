package jv.Player;

import jv.Mechanics.GameEngine;
import jv.Room.Room;

import java.util.Scanner;

/**
 * Created by joelvalentine on 01/03/2016.
 */

public class Player{
    private int energy = 1;
    private int health = 100;
    private String input;
    private Room globalLocation;
    private GameEngine ge;
    Scanner sc = new Scanner(System.in);

    public Player() {
    }

    public boolean isAlive() {
        for(int i = 0; i<health; i++) {
            if (health < 0 || energy < 0) {
                return true;
            }else {
                return false;
            }
        }
        return true;
    }

    public String input(){
        System.out.println("what are you going to do?");
        input = sc.nextLine();
        return input;
    }

    public void setGe(GameEngine ge) {
        this.ge = ge;
    }

    public void move(GameEngine ge){
        input();
        if(getInput().equals("NW")){
            getGlobalLocation().getPointsInRoom().get(getInput()).encountered(this, ge);
        }else if(getInput().equals("N")){
            getGlobalLocation().getPointsInRoom().get(getInput()).encountered(this, ge);
        }else if(getInput().equals("NE")){
            getGlobalLocation().getPointsInRoom().get(getInput()).encountered(this, ge);
        }else if(getInput().equals("W")){
            getGlobalLocation().getPointsInRoom().get(getInput()).encountered(this, ge);
        }else if(getInput().equals("C")){
            getGlobalLocation().getPointsInRoom().get(getInput()).encountered(this, ge);
        }else if(getInput().equals("E")){
            getGlobalLocation().getPointsInRoom().get(getInput()).encountered(this, ge);
        }else if(getInput().equals("SW")){
            getGlobalLocation().getPointsInRoom().get(getInput()).encountered(this, ge);
        }else if(getInput().equals("S")){
            getGlobalLocation().getPointsInRoom().get(getInput()).encountered(this, ge);
        }else if(getInput().equals("SE")){
            getGlobalLocation().getPointsInRoom().get(getInput()).encountered(this, ge);
        }else if(getInput().equals("instructions")){
            ge.instructions();
        }else if(getInput().equals("context of room")){
            System.out.println(getGlobalLocation().getContext().toString());
        }else{
            System.out.println("that isn't an allowed command try again. Try typing 'instructions' to get available commands");
        }
    }

    public String getInput() {
        return input;
    }

    public void setGlobalLocation(Room globalLocation) {
        this.globalLocation = globalLocation;
    }

    public Room getGlobalLocation() {
        return globalLocation;
    }

    public void myInventory(){

    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void energyDepletion(){
        int depletion = getEnergy();
        energy = depletion - 1;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "energy=" + energy +
                ", health=" + health +
                ", input='" + input + '\'' +
                ", globalLocation=" + globalLocation +
                ", sc=" + sc +
                '}';
    }
}
