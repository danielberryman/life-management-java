package com.lifemanagement.dev.tab;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TabRepository extends CrudRepository<Tab, Integer> {
    List<Tab> findBySectionId(Integer sectionId);
}