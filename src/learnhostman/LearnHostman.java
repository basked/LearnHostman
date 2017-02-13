/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Списочные массивы 
package learnhostman;

import java.lang.Math.*;
import java.time.*;
import java.util.*;

/**
 *
 * @author basket-PC
 */
public class LearnHostman {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public ArrayList<BreakBoy> getCompos() {
        return Compos;
    }

    public void setCompos(ArrayList<BreakBoy> Compos) {
        this.Compos = Compos;
    }

    public void addBBoy(BreakBoy b) {
//if b.g
    }
    private String name;
    private LocalDate dateCreate;
    private ArrayList<BreakBoy> Compos;
    /**
     * @param args the command line arguments
     */
    //константа самого взрослого человека
    final static int MIN_DATE_BIRTHD = 1983;
    //final static int CNT_B_BOYS = 7;

// Инфо обо всех Брейкерах
    public static void getBBoysInfo(String[] boysName) {
        int i;
        ArrayList<BreakBoy> BBoy = new ArrayList();
        // кол-во элементов до заполнения списочного массива
        System.out.println("Кол-во:" + BBoy.size());
        //Заполняем объектами Human
        for (i = 0; i < boysName.length; i++) {
            BBoy.add(i, new BreakBoy(boysName[i]));
        }
        //Выводим список
        System.out.println("ID | UserName | День рождения");
        System.out.println("------------------------");
        for (BreakBoy b : BBoy) {
            System.out.println(b.getId() + " |" + b.getName() + "  | " + b.getBirthd());
        };
        System.out.println("Кол-во:" + BBoy.size());
    }

    public static void main(String[] args) {
        //Изначальный список имен Брейкеров
        //!String[] BBoyNames = {"tyu   ", "Basket", "Sony  ", "Hip   ", "Ice   ", "Shake ", "Scope ", "Cap   ", "Cool  "};
        // вывод данных 
        //!getBBoysInfo(BBoyNames);

        // создам первую команду
        System.out.println("=====================Создаём команду==========================");
        BreakCrew bCrew = new BreakCrew("Last Move Crew", LocalDate.of(2001, Month.JUNE, 1));
        // место локации команды
        bCrew.setLocation("BAZA");
        // System.out.println(bCrew.getId() + "|" + bCrew.getName() + "|" + bCrew.getLocation() + "|" + bCrew.getDateCreate());
 
        //создаём Брейкеров
        bCrew.addBBoy(new BreakBoy("Xoxol"));
        bCrew.addBBoy(new BreakBoy("baske"));
        bCrew.addBBoy(new BreakBoy("baske")); // ошибка создания т.к. такой брейкер существует
        bCrew.addBBoy(new BreakBoy("basket"));
        bCrew.addBBoy(new BreakBoy("baskeT"));// ошибка создания т.к. такой брейкер существует
        bCrew.addBBoy(new BreakBoy("baskeD"));
        bCrew.addBBoy(new BreakBoy("BasKed"));// ошибка создания т.к. такой брейкер существует

        System.out.println("|" + bCrew.getId() + "|" + bCrew.getName() + "|" + bCrew.getLocation() + "|" + bCrew.getDateCreate());
        System.out.println("==============================================================");
        for (BreakBoy b : bCrew.getbBoys()) {
            System.out.println("[" + b.getId() + "]" + b.getName());
        }
        System.out.println("=====================Комманда создана=========================");
//Создаём вторую команду 
        System.out.println("=====================Создаём команду==========================");
        BreakCrew nyCrew = new BreakCrew("Rock Stady Crew", LocalDate.of(1977, Month.MARCH, 23));
        // место локации команды
        nyCrew.setLocation("New York");
        //создаём Брейкеров
        nyCrew.addBBoy(new BreakBoy("Ken Swift"));
        nyCrew.addBBoy(new BreakBoy("Crazy Leg"));
        nyCrew.addBBoy(new BreakBoy("Mr.Wiggles")); // ошибка создания т.к. такой брейкер существует
        nyCrew.addBBoy(new BreakBoy("Orko"));
        nyCrew.addBBoy(new BreakBoy("Masami"));// ошибка создания т.к. такой брейкер существует
        nyCrew.addBBoy(new BreakBoy("MR.Wiggles")); // ошибка создания т.к. такой брейкер существует
        nyCrew.addBBoy(new BreakBoy("Jimmy D"));
        nyCrew.addBBoy(new BreakBoy("Jimmy Lee"));
        System.out.println("==============================================================");
        System.out.println("|" + nyCrew.getId() + "|" + nyCrew.getName() + "|" + nyCrew.getLocation() + "|" + nyCrew.getDateCreate());
        System.out.println("==============================================================");
        for (BreakBoy b : nyCrew.getbBoys()) {
            System.out.println("[" + b.getId() + "]" + b.getName());
        }
        System.out.println("=====================Комманда создана=========================");
    }

};
