package com.qualigy.sbdynamodb.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.qualigy.sbdynamodb.model.Primary;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class PrimaryRepository {

    final private DynamoDBMapper dynamoDBMapper;

    public String createPrimary(Primary primary){
        dynamoDBMapper.save(primary);
        return primary.getId();
    }

    public Primary getPrimaryById(String id,String name){
        return dynamoDBMapper.load(Primary.class,id,name);
    }

    public Primary updatePrimary(String id, Primary primary){
        Primary load = dynamoDBMapper.load(Primary.class, id);
        // map these two entity
        load.setName(primary.getName());
        load.setNationality(primary.getNationality());
        dynamoDBMapper.save(load);

        return dynamoDBMapper.load(Primary.class, id);
    }

    public String deletePrimary(String id){
        Primary load = dynamoDBMapper.load(Primary.class, id);
        dynamoDBMapper.delete(load);
        return load.getId() + " get deleted !";
    }
}