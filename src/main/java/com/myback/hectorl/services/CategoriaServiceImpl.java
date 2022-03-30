package com.myback.hectorl.services;

import com.myback.hectorl.dao.CategoriaDao;
import com.myback.hectorl.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> findAll() {
        return categoriaDao.findAll();
    }
}
