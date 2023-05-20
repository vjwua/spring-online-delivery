package com.pnudev.springonlinedelivery.mapper;

import com.pnudev.springonlinedelivery.dto.OrderDto;
import com.pnudev.springonlinedelivery.dto.OrderRemoveDto;
import com.pnudev.springonlinedelivery.dto.OrderUpdateDto;
import com.pnudev.springonlinedelivery.models.Order;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order dtoToEntity (OrderDto orderDto);
    OrderDto entityToDto(Order order);

    void updateOrderFromDto(OrderUpdateDto updateOrderGetDTO, @MappingTarget Order order);

    void removeOrderFromDto(OrderRemoveDto removeOrderGetDTO, @MappingTarget Order order);
}
