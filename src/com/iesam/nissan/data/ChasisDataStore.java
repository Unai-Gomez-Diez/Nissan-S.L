package com.iesam.nissan.data;

import com.iesam.nissan.domain.models.Chasis;

import java.util.Map;
import java.util.TreeMap;

public class ChasisDataStore {
    private static ChasisDataStore instance = null;

    private Map<String, Chasis> dataStore = new TreeMap<>();

    public void añadir(Chasis model) {
        dataStore.put(model.getCodBastidor(), model);
    }



    public Chasis obtener(String codigo) {
        return dataStore.get(codigo);
    }



    public static ChasisDataStore getInstance() {
        if (instance == null) {
            instance = new ChasisDataStore();
        }
        return instance;
    }
}

