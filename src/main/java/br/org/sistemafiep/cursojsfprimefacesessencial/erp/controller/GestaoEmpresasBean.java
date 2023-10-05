package br.org.sistemafiep.cursojsfprimefacesessencial.erp.controller;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

    private static final long serialVersionUID = 1L;



    private static Integer Numero = 0;
    public GestaoEmpresasBean(){
        Numero++;
    }

    public Integer getNumero(){
        return Numero;
    }
}
