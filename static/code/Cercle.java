public class Cercle {
    
    double diametre = 0;
    
    public Cercle(double diametre) {
        this.diametre = diametre;
    }
    
    public double getPerimeter() {
        return  Math.PI * diametre;
    } 
    
    public void resize(double diametre) {
        this.diametre = diametre;
    }
    
}
