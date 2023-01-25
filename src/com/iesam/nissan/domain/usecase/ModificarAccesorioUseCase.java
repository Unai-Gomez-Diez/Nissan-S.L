package com.iesam.nissan.domain.usecase;

import com.iesam.nissan.data.AccesorioDataStore;
import com.iesam.nissan.data.ChasisDataStore;
import com.iesam.nissan.domain.models.Accesorio;

public class ModificarAccesorioUseCase {
    private AccesorioDataStore dataStore = AccesorioDataStore.getInstance();

    public Accesorio execute(Accesorio codigo) {
        return dataStore.modificar(codigo);
    }
}
