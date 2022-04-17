/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledefilas;


/**
 *
 * @author Diego Souza
 */
public class Senha {
    
    private String tipo;
    private int numero;

    public Senha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public Senha() {
        this.tipo = "";
        this.numero = 0;
    }
        
        
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return tipo +"-"+ numero;
    }

      
    }
