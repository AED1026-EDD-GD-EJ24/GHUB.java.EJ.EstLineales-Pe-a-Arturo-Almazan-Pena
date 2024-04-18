package cuadrupedo;

public class Cuadrupedo {
    private int idCuadrupedo;
    private String tipo;
    public Cuadrupedo(int idCuadrupedo, String tipo) {
        this.idCuadrupedo = idCuadrupedo;
        this.tipo = tipo;
    }
    public int getIdCuadrupedo() {
        return idCuadrupedo;
    }
    public void setIdCuadrupedo(int idCuadrupedo) {
        this.idCuadrupedo = idCuadrupedo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Cuadrupedo ->" + idCuadrupedo + ", tipo=" + tipo + "\n";
    }
    
    
    
}
