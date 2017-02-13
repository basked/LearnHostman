/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnhostman;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import static learnhostman.LearnHostman.MIN_DATE_BIRTHD;

/**
 *
 * @author basket-PC
 */
class BreakBoy {

    private int id;
    private static int nextId = 1;
    private String name;
    private int age;
    private LocalDate birthd;
// придумать реализацию стиля для bboy

    public int getId() {
        return id;
    }

    public int getCurrentYear() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR);
    }

    public BreakBoy(String name) {
        this.id = nextId;
        nextId++;
        this.name = name.toUpperCase();
        this.birthd = LocalDate.of(MIN_DATE_BIRTHD + new Random().nextInt(getCurrentYear() - MIN_DATE_BIRTHD), Month.SEPTEMBER, new Random().nextInt(27));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthd() {
        return birthd;
    }

}
