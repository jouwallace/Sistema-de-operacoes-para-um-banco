/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;

/**
 *
 * @author Jhonney
 */
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Métodos Personaliazdos
    public void estadoAtual(){
        
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)){
            this.setSaldo(50);
        } else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        
    }
    public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois ainda tem crédito.");
        }else if (this.getSaldo() <0 ){
            System.out.println("Conta não pode ser fechada pois ainda tem débito.");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }        
            
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
             //this.saldo = this.saldo + v;
           this.setSaldo(this.getSaldo() + v);
           System.out.println("Deposito realizado com sucesso na conta de: " + this.getDono());
        }else{
           System.out.println("impossivel depositar em uma conta fechada.");  
        }
}
    public void sacar(float v) {
        if (this.getStatus()) {
           if (this.getSaldo() >= v){
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Saque realizado na conta de" + this.getDono());
           }  else {
               System.out.println("Saldo insuficiente para saque");
           }
        }  else {
          System.out.println("Impossível sacar uma conta fechada!");
          }
    }
          
    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())){
            v = 12;
        }else if ("CP".equals(this.getTipo())){
           v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else{
             System.out.println("impossível pagar uma conta fechada ");
        }       
        
    }
    // Métodos Especiais
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    }
    
    
  
