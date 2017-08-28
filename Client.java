package com.sbt.lesson2;

public class Client extends Person implements Behavior, Banking {
    String name;
    int id;
    float inCash;
    float outCash;
    String account;

    public Client(String name, int id, float inCash, float outCash) {
        this.name = name;
        this.id = id;
        this.inCash = inCash;
        this.outCash = outCash;
    }

    @Override
    public void putCash(String account) {
        System.out.println("Я хотел" + padege() + " бы положить " + inCash + " рублей на свой счет " + account);
    }

    @Override
    public void getCash(String account) {
        System.out.println("Я хотел" + padege() + " бы снять " + outCash + " рублей со своего счета " + account);
    }

    @Override
    public void realPutCash(float outCash, float bankCash) {
        boolean stf;
        if (outCash > bankCash){
            System.out.println("Извините у нас сейчас нет таких средств!!!");
            stf = false;
            satisfaction(stf);
        } else {
            System.out.println("Да. Это возможно!!!");
            stf = true;
            satisfaction(stf);
        }
    }

    @Override
    public int getSex(int id) {
        if (id < 500){
        return 0;
        }
        else {
            return 1;
        }
    }


    @Override
    public void greeting() {
        System.out.println("Добрый день! Меня зовут "+name);
    }

    private String padege(){
        int s;
        String padege;
        s = getSex(id);
        if (s == 0) {
            padege = "";
        } else padege = "а";
        return padege;

    }

    private void satisfaction(boolean stf){
        if (stf == false){
            System.out.println("Плохо!! Я не удовлетворен" + padege() + "!!!");
        } else
            System.out.println("Спасибо!!! Я удовлетворен" + padege() + "!!!");
    }

}
