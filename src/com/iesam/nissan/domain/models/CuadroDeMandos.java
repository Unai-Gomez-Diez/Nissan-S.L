package com.iesam.nissan.domain.models;

public class CuadroDeMandos implements Accesorio {
    private String codigoAccesorio;
    private String modeloAccesorio;
    private Integer unidadesAccesorio;

    @Override
    public String getCodigoAccesorio() {
        return codigoAccesorio;
    }



    @Override
    public void setCodigoAccesorio(String codigoAccesorio) {
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
}
