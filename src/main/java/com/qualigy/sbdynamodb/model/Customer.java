package com.qualigy.sbdynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Mydynamon")
public class Customer {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;
    @DynamoDBAttribute
    private Integer age;
    @DynamoDBAttribute
    private String name;
    @DynamoDBAttribute
    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
    private Date dob;
    @DynamoDBAttribute
    private Boolean activeFlag;
}