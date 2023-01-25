package com.iesam.nissan.domain.models;

public class CuadroDeMandos implements Accesorios{
    private Integer codigoAccesorio;
    private String modeloAccesorio;
    private Integer unidadesAccesorio;

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
}
