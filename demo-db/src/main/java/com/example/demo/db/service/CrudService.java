package com.example.demo.db.service;

import java.util.List;
import java.util.Optional;

/**
 * "CRUD" stands for "Create, Read, Update, Delete" and refers to the basic operations on data: create, read, update and delete.
 *
 * @param <T>
 * @param <ID>
 */
public interface CrudService<T, ID> {

    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T entity);

    T update(T entity);

    void deleteById(ID id);
}
