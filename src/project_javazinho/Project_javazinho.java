package project_javazinho;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Elisson Novais
 */


public class Project_javazinho {

    public int setValor;

    /**
     * @return the Num_Cliente
     */
    public int getNum_Cliente() {
        return Num_Cliente;
    }

    /**
     * @param Num_Cliente the Num_Cliente to set
     */
    public void setNum_Cliente(int Num_Cliente) {
        this.Num_Cliente = Num_Cliente;
    }

    /**
     * @return the SaldoCC
     */
    public double getSaldoCC() {
        return SaldoCC;
    }

    /**
     * @param SaldoCC the SaldoCC to set
     */
    public void setSaldoCC(double SaldoCC) {
        this.SaldoCC = SaldoCC;
    }

    /**
     * @return the SaldoCP
     */
    public double getSaldoCP() {
        return SaldoCP;
    }

    /**
     * @param SaldoCP the SaldoCP to set
     */
    public void setSaldoCP(double SaldoCP) {
        this.SaldoCP = SaldoCP;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
	
	    private int CodCPF;
	    private int Num_Cliente;
	    private double SaldoCC;
	    private double SaldoCP;
	    private double valor;
		
	    
	    public Project_javazinho (int CodCPF, int Num_Cliente, double SaldoCC, double SaldoCP, double valor){
	        
	        this.CodCPF=CodCPF;
	        this.Num_Cliente=Num_Cliente;
	        this.SaldoCC=SaldoCC;
	        this.SaldoCP=SaldoCP;  
	        this.valor=valor;
	        	                            
	    } 
           	    
	    public int valoremconta(){
	    	System.out.println("identificador do cliente"+ getNum_Cliente());
	    	System.out.println("Saldo disponivel em conta poupanca " +getSaldoCP());
	    	System.out.println("Saldo conta corrente "+ getSaldoCC());
	    	
	    	return 0;
	    }
	    
	    public double depositar()
	    {
	        setSaldoCC(getSaldoCC() + getValor());
	        setSaldoCP(getSaldoCC()); 
	        System.out.println("Depositado: " + getValor());
	        System.out.println("Novo saldo: " + getSaldoCP() + "\n");
	        
	        return 0;
	    }
	   

	    public double Transferir(){
	        if(getSaldoCC() >= 0){
	            setSaldoCP(getSaldoCP() - getValor());
	            System.out.println("valor do saldo de transacao: " + getValor());
	            System.out.println("novo saldo Conta poupanca "+getSaldoCP()+ "\n");
	        } else {
	            System.out.println("Saldo insuficiente. Faça um depósito\n");
	        }
			return 1;
	    }

	    	 

		public Project_javazinho() {
			
		}  
	    

}
