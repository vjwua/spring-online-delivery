package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.models.MenuItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuItemService {
    public List<MenuItem> getMenuItems();
}
