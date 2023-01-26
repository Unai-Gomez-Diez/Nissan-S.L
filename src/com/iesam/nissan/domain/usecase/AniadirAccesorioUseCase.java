package com.iesam.nissan.domain.usecase;

import com.iesam.nissan.data.AccesorioDataStore;
import com.iesam.nissan.domain.models.Accesorio;

public class AniadirAccesorioUseCase {
    private AccesorioDataStore dataStore = AccesorioDataStore.getInstance();

    public void execute(Accesorio accesorio) {
        dataStore.aniadir(accesorio);
    }
}
