package cw10.dao;

import java.util.List;

public interface GenericDAO<T> {

    T get(int id);

    List<T> getAll();

    void create(T e);

    void delete(int id);

    void update(T e);
}
