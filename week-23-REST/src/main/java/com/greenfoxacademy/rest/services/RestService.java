package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.ArrayHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestService {

    public int arrayHandler(ArrayHandler handler, String what) {
        int result = 0;
        if (what.equals("sum")){
            result = handler.sum();
        } else if (what.equals("multiply")){
            result = handler.multiply();
        }return result;
    }

    public int[] doublingArrayHandler(ArrayHandler handler) {
        return handler.doubling();
    }
}
