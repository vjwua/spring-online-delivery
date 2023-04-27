package com.pnudev.springonlinedelivery.repos;

import com.pnudev.springonlinedelivery.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
