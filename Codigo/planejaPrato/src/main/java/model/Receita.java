package model;

public class Receita {
		
	    public String nomeReceita;
	    public String ingredientes,modoDePreparo;
	    public int idReceita;

	    public void setNome(String nome) {
	    	this.nomeReceita = nome;
	    }
	    public void setIngredientes(String ingredientes) {
	    	this.ingredientes = ingredientes;
	    }
	    public void setModoDePreparo(String modoDePreparo) {
	    	this.modoDePreparo = modoDePreparo;
	    }

	    public void setId(int idReceita) {
	    	this.idReceita = idReceita;
	    }
	    public int getId() {
	        return idReceita;
	    }

	    public String getNome() {
	        return nomeReceita;
	    }


	    public String getModoDePreparo() {
	        return modoDePreparo;
	    }

	    public String getIngredientes() {
	        return ingredientes;
	    }

}
