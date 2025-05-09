package pe.edu.upeu.sysgestrepuesto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ICrudGenericoRepository<T,ID> extends
        JpaRepository<T,ID> {
}