package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class OneHelloGraphQLQuery extends GraphQLQuery {
  public OneHelloGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public OneHelloGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "oneHello";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public OneHelloGraphQLQuery build() {
      return new OneHelloGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
