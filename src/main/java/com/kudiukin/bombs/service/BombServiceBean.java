package com.kudiukin.bombs.service;

import com.kudiukin.bombs.domain.Bomb;
import com.kudiukin.bombs.repository.BombRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class BombServiceBean implements BombService {

    @Autowired
    private BombRepository bombRepository;

    @Override
    public Bomb create(Bomb bomb) {
        return bombRepository.save(bomb);
    }

    @Override
    public List<Bomb> view() {
        return bombRepository.findAll();
    }

    @Override
    public Bomb viewById(Integer id) {
        //return bombRepository.getById(id);
        return bombRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not Found id: " + id));
    }

    @Override
    public Bomb update(Integer id, Bomb bomb) {
        return bombRepository.findById(id)
                .map(entity -> {
                    entity.setName(bomb.getName());
                    entity.setWeight(bomb.getWeight());
                    entity.setRange(bomb.getRange());
                    entity.setCountry(bomb.getCountry());
                    entity.setProduceDate(bomb.getProduceDate());
                    return bombRepository.save(entity);
                })
                .orElseThrow(() -> new EntityNotFoundException("Not Found id = " + id));
    }

    @Override
    public void delete(Integer id) {
        bombRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        bombRepository.deleteAll();
    }
}
