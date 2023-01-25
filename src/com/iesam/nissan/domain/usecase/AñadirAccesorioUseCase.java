package com.iesam.nissan.domain.usecase;

import com.iesam.nissan.data.AccesorioDataStore;
import com.iesam.nissan.domain.models.Accesorio;

public class AñadirAccesorioUseCase {
    private AccesorioDataStore dataStore = AccesorioDataStore.getInstance();

    public void execute(Accesorio accesorio) {
        dataStore.añadir(accesorio);
    }
}
