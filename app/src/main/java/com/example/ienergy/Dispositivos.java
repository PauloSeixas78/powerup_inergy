package com.example.ienergy;

public class Dispositivos {

    private Long id;
    private String nome;
    private Integer estado;
    private String comodo;

    public Dispositivos(Long id, String nome, Integer estado, String comodo) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.comodo = comodo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getComodo() {
        return comodo;
    }

    public void setComodo(String comodo) {
        this.comodo = comodo;
    }



}
