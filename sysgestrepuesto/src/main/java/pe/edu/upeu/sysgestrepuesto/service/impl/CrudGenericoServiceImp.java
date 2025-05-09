package pe.edu.upeu.sysgestrepuesto.service.impl;

import pe.edu.upeu.sysgestrepuesto.exception.ModelNotFoundException;
import pe.edu.upeu.sysgestrepuesto.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysgestrepuesto.service.ICrudGenericoService;
import java.util.List;

public abstract class CrudGenericoServiceImp<T,ID> implements
        ICrudGenericoService<T,ID> {
    protected abstract ICrudGenericoRepository<T,ID> getRepo();
    @Override
    public T save(T t) {
        return getRepo().save(t);
    }
    @Override
    public T update(ID id, T t) {
        getRepo().findById(id).orElseThrow(() -> new
                ModelNotFoundException("ID NOT FOUND: " + id));
        return getRepo().save(t);
    }
    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }
    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElseThrow(() -> new
                ModelNotFoundException("ID NOT FOUND: " + id));
    }
    @Override
    public void delete(ID id) {
        getRepo().findById(id).orElseThrow(() -> new
                ModelNotFoundException("ID NOT FOUND: " + id));
        getRepo().deleteById(id);
    }
}
