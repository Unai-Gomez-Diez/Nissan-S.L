package com.iesam.nissan.data;

import com.iesam.nissan.domain.models.Accesorio;

import java.util.Map;
import java.util.TreeMap;

public class AccesorioDataStore {
    private static AccesorioDataStore instance = null;
    private Map<String, Accesorio> dataStore = new TreeMap<>();

    public void aniadir(Accesorio model) {
        dataStore.put(model.getCodigoAccesorio(), model);
    }

    public void eliminar(String codigo) {
        dataStore.remove(codigo);


    }

    public Accesorio obtener(String codigo) {
        return dataStore.get(codigo);
    }

    public Accesorio modificar(Accesorio codigo) {
        dataStore.put(codigo.getCodigoAccesorio(), codigo);

        return codigo;
    }

    public static AccesorioDataStore getInstance() {
        if (instance == null) {
            instance = new AccesorioDataStore();
        }
        return instance;
    }
}

