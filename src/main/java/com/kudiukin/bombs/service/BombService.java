package com.kudiukin.bombs.service;

import com.kudiukin.bombs.domain.Bomb;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BombService {
    Bomb create (Bomb bomb);

    List<Bomb> view();

    Bomb viewById(Integer id);

    Bomb update(Integer id, Bomb bomb);

    void delete(Integer id);

    void deleteAll();

}
