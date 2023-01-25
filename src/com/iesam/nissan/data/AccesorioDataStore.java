package com.iesam.nissan.data;

import com.iesam.nissan.domain.models.Accesorio;

import java.util.Map;
import java.util.TreeMap;

public class AccesorioDataStore {
    private static AccesorioDataStore instance = null;
    private Map<String, Accesorio> dataStore = new TreeMap<>();

    public void aniadir(Accesorio accesorio) {
        dataStore.put(accesorio.getCodigoAccesorio(), accesorio);
    }

    public void eliminar(String codigo) {
        dataStore.remove(codigo);


    }

    public Accesorio obtener(String codigo) {
        return dataStore.get(codigo);
    }

    public Accesorio modificar(Accesorio accesorio) {
        dataStore.put(accesorio.getCodigoAccesorio(), accesorio);

        return accesorio;
    }

    public static AccesorioDataStore getInstance() {
        if (instance == null) {
            instance = new AccesorioDataStore();
        }
        return instance;
    }
}

