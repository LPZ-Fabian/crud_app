package formcreatorapp.repository;

import formcreatorapp.model.FormElement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementRepository extends JpaRepository<FormElement, Long> {

}
