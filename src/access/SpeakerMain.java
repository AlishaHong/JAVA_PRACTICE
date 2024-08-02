package access;

public class SpeakerMain {
    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);
        speaker.setvolumeUp();
        speaker.getVolume();
        speaker.setvolumeUp();
        speaker.getVolume();
        speaker.volumeDown();
        speaker.getVolume();
//        speaker.volume = 200;

    }
}
