package com.freight.services;

import com.freight.dtos.FreightRequestDto;
import com.freight.dtos.FreightResponseDto;
import com.freight.models.ExpressFreight;
import com.freight.models.StandardFreight;

public class FreightService implements ApplicationService<FreightRequestDto, FreightResponseDto> {
    @Override
    public FreightResponseDto handle(FreightRequestDto request) {

        FreightResponseDto response = new FreightResponseDto(0,0);

        if(request == null) {

            // Hızlı Kargo
            if(request.getFreightType().equals("Express")){
                if(request.getLight()){
                    // hafif yük ise
                    var freight = new ExpressFreight(request.getHeight(),request.getWidth(),request.getLength(),request.getShippedDate());

                    double listPrice = freight.calculatePrice(request.getUnitPrice());

                    response =  new FreightResponseDto(listPrice,freight.getWeight());
                }
                else {
                    // Ağır ise
                    var freight = new ExpressFreight(request.getWeight(),request.getShippedDate());

                    double listPrice = freight.calculatePrice(request.getUnitPrice());

                    response =  new FreightResponseDto(listPrice,freight.getWeight());

                }
            } else if(request.getFreightType().equals("Standard")) {

                // Hafif Yüklü
                if(request.getLight()){
                    var freight = new StandardFreight(request.getHeight(),request.getWidth(),request.getLength());

                    double listPrice = freight.calculatePrice(request.getUnitPrice());

                    response  = new FreightResponseDto(listPrice,freight.getWeight());
                } else {
                    var freight = new StandardFreight(request.getWeight());

                    double listPrice = freight.calculatePrice(request.getUnitPrice());

                    response  = new FreightResponseDto(listPrice,freight.getWeight());
                }
            } else if (request.getFreightType().equals("International")) {
                return response;
            }
        }

        return  response;
    }
}
