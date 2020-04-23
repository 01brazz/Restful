/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marconivr.testjersey.domain;

import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author david
 */
@XmlRootElement
@XmlType(propOrder = {"id", "nome", "cognome", "eta", "telefono", "email"})
public class Post {

    private int id;

    private String titolo;

    private String autore;

    private String contenuto;

    private String dataOra;

    public Post() {
    }

    public Post(Integer Id, String titolo, String autore, String contenuto, String dataOra) {
        this.id = Id;
        this.titolo = titolo;
        this.autore = autore;
        this.contenuto = contenuto;
        this.dataOra = dataOra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public String getDataOra() {
        return dataOra;
    }

    public void setDataOra(String dataOra) {
        this.dataOra = dataOra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.titolo);
        hash = 71 * hash + Objects.hashCode(this.autore);
        return hash;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nome=" + titolo
                + ", cognome=" + autore + '}';
    }
}
