package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class DeleteHelloGraphQLQuery extends GraphQLQuery {
  public DeleteHelloGraphQLQuery(int number, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    getInput().put("number", number);                   
  }

  public DeleteHelloGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "deleteHello";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private int number;

    private String queryName;

    public DeleteHelloGraphQLQuery build() {
      return new DeleteHelloGraphQLQuery(number, queryName, fieldsSet);
               
    }

    public Builder number(int number) {
      this.number = number;
      this.fieldsSet.add("number");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
