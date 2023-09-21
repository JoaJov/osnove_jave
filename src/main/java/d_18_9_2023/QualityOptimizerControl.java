package d_18_9_2023;

public class QualityOptimizerControl extends Control{
    private double brzinaInterneta;

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl() {
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer){
       double kvalitetVidea=this.brzinaInterneta * 10.1;

       if (kvalitetVidea < 240){
    videoPlayer.setKvalitetVidea(240);
       }else if (kvalitetVidea < 144){
           videoPlayer.setKvalitetVidea(144);
       }else
           videoPlayer.setKvalitetVidea(720);
       }
    }

