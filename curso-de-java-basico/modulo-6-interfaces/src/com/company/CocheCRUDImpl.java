package com.company;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public List<Coche> all() {
        System.out.println("all -> Listado de todos los coches");
        return null;
    }

    @Override
    public void save(Coche coche) {
        System.out.println("save -> Guarda un nuevo coche");
    }

    @Override
    public void update(Coche coche) {
        System.out.println("update -> Modifica o actualiza un coche");
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete -> Elimina un coche");
    }
}
