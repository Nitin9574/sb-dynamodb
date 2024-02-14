package com.qualigy.sbdynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "Mydynamom")
public class Primary {

    @DynamoDBHashKey
    private String id;

    @DynamoDBRangeKey
    private String name;

    @DynamoDBAttribute
    private String nationality;
}

