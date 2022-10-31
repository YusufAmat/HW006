public class Daire {
    private double yaricap;


    public Daire(double yaricap) {
        this.yaricap=yaricap;
    }

    public Daire() {
    }

    public double getYaricap() {
        if (this.yaricap >0) {
            return this.yaricap;
        }
        return 0.0;
    }

    public double getAlan() {
        return Math.PI*getYaricap()*getYaricap();
    }
}
