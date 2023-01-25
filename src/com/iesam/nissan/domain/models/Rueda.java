package com.iesam.nissan.domain.models;

public class Rueda implements Accesorios{
    private Integer codigoAccesorio;
    private String modeloAccesorio;
    private Integer unidadesAccesorio;
    private String marca;
    private Integer diametro;


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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }
}
