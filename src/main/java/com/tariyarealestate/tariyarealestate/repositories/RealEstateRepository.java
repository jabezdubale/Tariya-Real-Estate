package com.tariyarealestate.tariyarealestate.repositories;

import com.tariyarealestate.tariyarealestate.domains.RealEstate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealEstateRepository extends CrudRepository<RealEstate, Long> {}
