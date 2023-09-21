package d_18_9_2023;

public class TimeControl extends Control{

    private boolean vreme;
    public TimeControl() {
    }

    public TimeControl(boolean vreme) {
        this.vreme = vreme;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer){
        if (vreme) {
            videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() + 15);
            if (videoPlayer.getDuzinaVidea() < videoPlayer.getTrenutnoVreme()){
                videoPlayer.setTrenutnoVreme(videoPlayer.getDuzinaVidea());
    }
}else {

            videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() - 15);
            if (videoPlayer.getTrenutnoVreme() < 0) {
                videoPlayer.setTrenutnoVreme(0);
            }
        }
    }
}