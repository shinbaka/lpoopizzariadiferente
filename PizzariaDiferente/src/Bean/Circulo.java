/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author dell-soncini
 */
public class Circulo extends Forma{
    
    public double raio;
    public double area;
    
    public Circulo() {
    }
    
    public Circulo (double raio){
        this.raio = raio;
    }
    
    @Override
    public double getArea(){
        return Math.PI * (raio *raio); 
    }
    
    @Override
    public double getMedida(){
        return   Math.sqrt(area  / Math.PI );
    }
    
    @Override
    public void setMedida(double raio){
        this.raio = raio;
        this.area =  getArea();
    }
    
    @Override
    public void setArea(double area){
        this.area = area;
        this.raio =  getMedida();
    }
    
    @Override
    public String getNome(){
        return "Circulo";
    }
    @Override
    public int getId(){
        return 1;
    }
}
