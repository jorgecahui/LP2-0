package pe.edu.upeu.sysgestrepuesto.service;

import java.util.List;
//aqui esta todo el CRUD
public interface ICrudGenericoService<T,ID> {
    T save(T t);
    T update(ID id, T t);
    List<T> findAll();
    T findById(ID id);
    void delete(ID id);
}