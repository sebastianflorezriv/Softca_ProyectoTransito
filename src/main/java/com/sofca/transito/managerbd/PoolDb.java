package com.sofca.transito.managerbd;

import java.util.ArrayList;

public class PoolDb {
    private static PoolDb instance;
    private ArrayList<Conexion> pools;
    private PoolDb(){
            pools = new ArrayList<>();
    }

    public static PoolDb getInstance(){
        if(instance==null){
            instance=new PoolDb();
            return instance;
        }
        return instance;
    }

    /**
     * Creo las 10 conexiones
     */
    public void createConections(){
        Conexion conexion=null;
        for (int id=0;id<3;id++){
            conexion = new Conexion();
            conexion.connect();
            conexion.setOcupada(false);
            pools.add(conexion);

        }
    }

    public Conexion getConexion(){
        Conexion conexionFree=null;
        for (int id=0;id<3;id++){
            if(pools.get(id).isOcupada()==false){
                conexionFree=pools.get(id);
            }
        }
        conexionFree.ocupar();
        return conexionFree;
    }

}
