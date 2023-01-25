package com.iesam.nissan.domain.usecase;

import com.iesam.nissan.data.ChasisDataStore;
import com.iesam.nissan.domain.models.Chasis;

public class ObtenerChasisUseCase {
    private ChasisDataStore dataStore = ChasisDataStore.getInstance();

    public Chasis execute(String codigo) {
        return dataStore.obtener(codigo);
    }
}
