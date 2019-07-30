package io.github.jhipster.application.service.impl;

import io.github.jhipster.application.service.PushkarJhipsterService;
import io.github.jhipster.application.domain.PushkarJhipster;
import io.github.jhipster.application.repository.PushkarJhipsterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link PushkarJhipster}.
 */
@Service
@Transactional
public class PushkarJhipsterServiceImpl implements PushkarJhipsterService {

    private final Logger log = LoggerFactory.getLogger(PushkarJhipsterServiceImpl.class);

    private final PushkarJhipsterRepository pushkarJhipsterRepository;

    public PushkarJhipsterServiceImpl(PushkarJhipsterRepository pushkarJhipsterRepository) {
        this.pushkarJhipsterRepository = pushkarJhipsterRepository;
    }

    /**
     * Save a pushkarJhipster.
     *
     * @param pushkarJhipster the entity to save.
     * @return the persisted entity.
     */
    @Override
    public PushkarJhipster save(PushkarJhipster pushkarJhipster) {
        log.debug("Request to save PushkarJhipster : {}", pushkarJhipster);
        return pushkarJhipsterRepository.save(pushkarJhipster);
    }

    /**
     * Get all the pushkarJhipsters.
     *
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public List<PushkarJhipster> findAll() {
        log.debug("Request to get all PushkarJhipsters");
        return pushkarJhipsterRepository.findAll();
    }


    /**
     * Get one pushkarJhipster by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<PushkarJhipster> findOne(Long id) {
        log.debug("Request to get PushkarJhipster : {}", id);
        return pushkarJhipsterRepository.findById(id);
    }

    /**
     * Delete the pushkarJhipster by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete PushkarJhipster : {}", id);
        pushkarJhipsterRepository.deleteById(id);
    }
}
