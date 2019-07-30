package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.PushkarJhipster;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PushkarJhipster entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PushkarJhipsterRepository extends JpaRepository<PushkarJhipster, Long> {

}
