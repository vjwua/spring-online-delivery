package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.models.MenuItem;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MenuItemServiceImpl implements MenuItemService {
    @Override
    public List<MenuItem> getMenuItems() {
        return Collections.emptyList();
    }
}
