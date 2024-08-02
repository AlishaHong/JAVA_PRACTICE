package oop1;

import java.sql.SQLOutput;

public class MusicPlayerData {
    int volume;
    boolean isOn;

    void volumeUp(){
        volume++;
        System.out.println("볼륨: " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("볼륨: " + volume);
    }
    void on(){
        isOn = true;
        System.out.println("전원켜짐");
        }
    void off(){
        isOn = false;
        System.out.println("전원꺼짐");
    }

    void stateCheck(){
       if(isOn){
           System.out.println("볼륨: "+ volume + "전원켜짐");
       }else{
           System.out.println("전원꺼짐");
       }

    }
    }



