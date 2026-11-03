package DailyAssignments;

interface Camera {
    void takePhoto();
    void recordVideo();
}

interface MusicPlayer {
    void playMusic();
    void stopMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Photo captured successfully.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video recording started.");
    }

    @Override
    public void playMusic() {
        System.out.println("Music is playing.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped.");
    }

    void makeCall() {
        System.out.println("Making a phone call.");
    }
}

public class Nov3_Smartdevice {

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.takePhoto();
        phone.recordVideo();
        phone.playMusic();
        phone.stopMusic();
        phone.makeCall();
    }
}
