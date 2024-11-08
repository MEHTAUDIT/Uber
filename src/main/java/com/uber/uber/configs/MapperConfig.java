package com.uber.uber.configs;

import com.uber.uber.dto.PointDto;
import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {

        ModelMapper mapper= new ModelMapper();
        return mapper;
    }
}
