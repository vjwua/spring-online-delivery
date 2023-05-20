package com.pnudev.springonlinedelivery.dto;

import com.pnudev.springonlinedelivery.models.Status;
import lombok.Data;

@Data
public class OrderRemoveDto {
    private Status status;
}
