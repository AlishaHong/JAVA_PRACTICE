package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void setvolumeUp(){

        if(volume >= 100) {
            System.out.println("최대음량입니다.");
        }else{
            volume += 10;
        }
    }

    void volumeDown(){
        volume -= 10;
    }

    void getVolume(){
        System.out.println("현재음량 : "+volume);
    }
}
