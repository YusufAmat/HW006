public class Silindir extends Daire{
    private double yukseklik;

    public Silindir(double yaricap, double yukseklik) {
        super(yaricap);
        this.yukseklik = yukseklik;
    }

    public Silindir() {
    }

    public double getYukseklik() {
        if (this.yukseklik >0) {
            return this.yukseklik;
        }
        return 0.0;
    }

    public double getHacim(){
        return super.getAlan()*getYukseklik();
    }

    public double getAlan () {
        return 2*Math.PI*getYaricap()*getYaricap() + 2*Math.PI*getYaricap()*getYukseklik();
    }
}
