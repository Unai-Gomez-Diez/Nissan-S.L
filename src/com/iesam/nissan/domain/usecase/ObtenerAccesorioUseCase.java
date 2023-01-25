package com.iesam.nissan.domain.usecase;

import com.iesam.nissan.data.AccesorioDataStore;
import com.iesam.nissan.data.ChasisDataStore;
import com.iesam.nissan.domain.models.Accesorio;
import com.iesam.nissan.domain.models.Chasis;

public class ObtenerAccesorioUseCase {
    private AccesorioDataStore dataStore = AccesorioDataStore.getInstance();

    public Accesorio execute(String codigo) {
        return dataStore.obtener(codigo);
    }
}
