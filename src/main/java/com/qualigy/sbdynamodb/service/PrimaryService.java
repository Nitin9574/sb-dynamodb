package com.qualigy.sbdynamodb.service;


import com.qualigy.sbdynamodb.model.Primary;
import com.qualigy.sbdynamodb.repository.PrimaryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrimaryService {
    final private PrimaryRepository primaryRepository;

    public String createPrimary(Primary primary){
        return primaryRepository.createPrimary(primary);
    }

    public Primary updatePrimary(String id, Primary primary){
        return primaryRepository.updatePrimary(id, primary);
    }

    public Primary getPrimary(String id,String name){
        return primaryRepository.getPrimaryById(id, name);
    }

    public String deletePrimary(String id){
        return primaryRepository.deletePrimary(id);
    }
}