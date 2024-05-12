/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reril
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String area;
    
    public Funcionario(String nome, String cpf, double salario, String area){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.area = area;
        
        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getArea(){
        return area;
    }
    
    public void setArea(String area){
        this.area = area;
    }
}
