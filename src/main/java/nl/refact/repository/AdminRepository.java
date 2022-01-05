package nl.refact.repository;

import nl.hsleiden.svdj8.models.tables.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Long> {
}
