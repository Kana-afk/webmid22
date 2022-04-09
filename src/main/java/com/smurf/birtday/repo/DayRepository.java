package com.smurf.birtday.repo;

import com.smurf.birtday.models.Day;
import org.springframework.data.repository.CrudRepository;

public interface DayRepository extends CrudRepository<Day, Long> {
}
