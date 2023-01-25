package com.iesam.nissan.domain.usecase;

import com.iesam.nissan.data.AccesorioDataStore;

public class EliminarAccesorioUseCase {
    private AccesorioDataStore dataStore = AccesorioDataStore.getInstance();
    public String execute(String codigo) {
       dataStore.eliminar(codigo);
        return codigo;
    }

}
