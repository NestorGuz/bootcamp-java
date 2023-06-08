package com.company;

import java.util.List;

public interface CocheCRUD {
    List<Coche> all();
    void save(Coche coche);
    void update(Coche coche);
    void delete(Coche coche);

}
