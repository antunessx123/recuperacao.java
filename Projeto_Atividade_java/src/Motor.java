public class Motor {
    private float volCilindros;
    private int potencia;

    public Motor(float vC, int p){
        this.volCilindros = vC;
        this.potencia = p;
    }

    public float getVolCilindros(){
        return volCilindros;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setVolCilindros(float vC){
        this.volCilindros = vC;
    }

    public void setPotencia(int p){
        this.potencia = p;
    }
    
    public String infoMotor(){
        return "Motor" + volCilindros + " " + potencia + "cv";
    }


}
