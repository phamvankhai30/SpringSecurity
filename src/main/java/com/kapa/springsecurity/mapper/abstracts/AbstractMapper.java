package com.kapa.springsecurity.mapper.abstracts;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class AbstractMapper<E, D> {
    @Autowired
    private ModelMapper modelMapper;

    public D toDto(E entity) {
        return Objects.isNull(entity) ? null :
                modelMapper.map(entity, getDTOClass());
    }

    public E toEntity(D dto) {
        return Objects.isNull(dto) ? null :
                modelMapper.map(dto, getEntityClass());
    }

    public List<D> toDtoList(List<E> entityList) {
        return Objects.isNull(entityList) ? null :
                entityList.stream()
                        .map(this::toDto)
                        .collect(Collectors.toList());
    }

    public List<E> toEntityList(List<D> dtoList) {
        return Objects.isNull(dtoList) ? null :
                dtoList.stream()
                        .map(this::toEntity)
                        .collect(Collectors.toList());
    }

    protected abstract Class<E> getEntityClass();

    protected abstract Class<D> getDTOClass();
}
