public class Smartphone {

    interface Camera {
        void takePhoto();
    }

    interface MusicPlayer {
        void playMusic();
    }

    static class SmartphoneCamera implements Camera {
        @Override
        public void takePhoto() {
            System.out.println("Taking photo");
        }
    }

    static class SmartphoneMusicPlayer implements MusicPlayer {
        @Override
        public void playMusic() {
            System.out.println("Playing music");
        }
    }

    public static void main(String[] args) {
        Camera camera = new SmartphoneCamera();
        MusicPlayer musicPlayer = new SmartphoneMusicPlayer();

        camera.takePhoto();
        musicPlayer.playMusic();
    }
}