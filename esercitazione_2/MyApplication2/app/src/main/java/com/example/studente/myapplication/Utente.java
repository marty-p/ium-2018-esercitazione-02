package com.example.studente.myapplication;

public class Utente {
    public Utente(String nome, String cognome, String dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    String nome;
    String cognome;
    String dataNascita;
}
