package nl.refact.repository;

import nl.hsleiden.svdj8.models.tables.Grant;
import org.springframework.data.repository.CrudRepository;

public interface GrantRepository extends CrudRepository<Grant, Long> {
   }