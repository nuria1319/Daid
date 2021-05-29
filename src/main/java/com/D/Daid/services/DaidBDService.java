package com.D.Daid.services;

import java.util.ArrayList;

import com.D.Daid.models.DaidModel;
import com.D.Daid.repositories.DaidRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaidBDService {
   @Autowired
   DaidRepository daidRepository;
 
   public ArrayList<DaidModel> obtenerDaid() {

    return (ArrayList<DaidModel>) daidRepository.findAll();
}

public DaidModel guardarDaid(DaidModel daid) {
    return daidRepository.save(daid);
}

}
