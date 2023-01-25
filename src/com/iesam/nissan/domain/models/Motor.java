package com.iesam.nissan.domain.models;

public class Motor implements Accesorios{
    private Integer codigoAccesorio;
    private String modeloAccesorio;
    private Integer unidadesAccesorio;
    private Integer cilindrada;
    private Integer caballos;

    @Override
    public Integer getCodigoAccesorio() {
        return codigoAccesorio;
    }

    @Override
    public void setCodigoAccesorio(Integer codigoAccesorio) {
        this.codigoAccesorio = codigoAccesorio;
    }

    @Override
    public String getModeloAccesorio() {
        return modeloAccesorio;
    }

    @Override
    public void setModeloAccesorio(String modeloAccesorio) {
        this.modeloAccesorio = modeloAccesorio;
    }

    @Override
    public Integer getUnidadesAccesorio() {
        return unidadesAccesorio;
    }

    @Override
    public void setUnidadesAccesorio(Integer unidadesAccesorio) {
        this.unidadesAccesorio = unidadesAccesorio;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getCaballos() {
        return caballos;
    }

    public void setCaballos(Integer caballos) {
        this.caballos = caballos;
    }
}
