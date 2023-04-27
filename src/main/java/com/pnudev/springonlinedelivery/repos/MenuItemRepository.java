package com.pnudev.springonlinedelivery.repos;

import com.pnudev.springonlinedelivery.models.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

}
