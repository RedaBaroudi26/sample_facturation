package com.project.product.datafetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class TestDataFetcher {

    @DgsQuery
    public String TestGraphql(){
        return "test success.";
    }

}
