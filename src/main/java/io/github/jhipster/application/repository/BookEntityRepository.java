package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.BookEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the BookEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BookEntityRepository extends JpaRepository<BookEntity, Long> {

}
