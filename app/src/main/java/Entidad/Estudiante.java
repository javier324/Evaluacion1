package Entidad;

public class Estudiante {

    private String nombre;
    private String codigo;
    private String materia;
    private Double parcial1;
    private Double parcial2;
    private Double parcial3;
    private Double promedio;

    public void SetNombre(String value){
        this.nombre = value;
    }
    public String GetNombre(){
        return this.nombre;
    }

    public void SetCodigo(String value){
        this.codigo = value;
    }
    public String GetCodigo(){
        return this.codigo;
    }
    public void SetMateria(String value){
        this.materia = value;
    }
    public String GetMateria(){
        return this.materia;
    }
    public void SetParcial1(Double value){
        this.parcial1 = value;
    }
    public Double GetParcial1(){
        return this.parcial1;
    }
    public void SetParcial2(Double value){
        this.parcial2 = value;
    }
    public Double GetParcial2(){
        return this.parcial2;
    }
    public void SetParcial3(Double value){
        this.parcial1 = value;
    }
    public Double GetParcial3(){
        return this.parcial3;
    }
    public void SetPromedio(Double value){
        this.promedio = value;
    }
    public Double GetPromedio(){
        return this.promedio;
    }


}
