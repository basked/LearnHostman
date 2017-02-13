
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnhostman;

import java.time.*;
import java.util.*;
import java.lang.*;

/**
 * @
 * @author basket-PC
 */
public class BreakCrew {

    public BreakCrew(String name, LocalDate dateCreate) {
        id = nextId;
        nextId++;
        this.name = name;
        this.bBoys = new ArrayList<>();
        this.dateCreate = dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public void setbBoys(ArrayList<BreakBoy> bBoys) {
        this.bBoys = bBoys;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public ArrayList<BreakBoy> getbBoys() {
        return bBoys;
    }

    public String getLocation() {
        return location;
    }

    private boolean isExist(String nameBBoy) {
        boolean b = false;
        for (BreakBoy boy : this.bBoys) {
            if (nameBBoy.toUpperCase().equals(boy.getName().toUpperCase())) {
                b = true;
                break;
            } else {
                b = false;
            }
        }
        return b;
    }

    public void addBBoy(BreakBoy bboy) {
        if (isExist(bboy.getName()) == false) {
            this.bBoys.add(bboy);
        } else {
            System.out.println("Ошибка добавления в команду.Брейкер " + bboy.getName() + "[" + bboy.getId() + "] существует в команде<"+this.name+">!");
        }
    }
    ;

    private int id;// ID
    private static int nextId = 1;// счётчик ID 
    private String name;// название команды
    private LocalDate dateCreate;// дата создания команды
    private ArrayList<BreakBoy> bBoys; // список брейкеров в команде
    private String location;// место нахождение команды

}
