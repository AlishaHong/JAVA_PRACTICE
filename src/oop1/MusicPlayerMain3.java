package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악플레이어 켜기
        data.on();
        //볼륨 증가
        data.volumeUp();
        //볼륨 증가
        data.volumeUp();
        //볼륨 감소
        data.volumeDown();
        //음악 플레이어 상태
        data.stateCheck();
        //음악 플레이어 끄기
        data.off();
    }
}