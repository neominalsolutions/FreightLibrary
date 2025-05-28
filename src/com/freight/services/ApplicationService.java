package com.freight.services;


public interface ApplicationService<TRequest,TResponse> {
    TResponse handle(TRequest request);

}
