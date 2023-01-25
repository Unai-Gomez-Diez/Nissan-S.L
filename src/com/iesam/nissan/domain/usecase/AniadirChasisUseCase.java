package com.iesam.nissan.domain.usecase;

import com.iesam.nissan.data.ChasisDataStore;
import com.iesam.nissan.domain.models.Chasis;

public class AniadirChasisUseCase {
    private ChasisDataStore dataStore = ChasisDataStore.getInstance();

    public void execute(Chasis chasis) {
       dataStore.añadir(chasis);
    }
}
