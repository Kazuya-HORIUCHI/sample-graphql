package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class RandomStockGraphQLQuery extends GraphQLQuery {
  public RandomStockGraphQLQuery(String queryName) {
    super("subscription", queryName);
  }

  public RandomStockGraphQLQuery() {
    super("subscription");
  }

  @Override
  public String getOperationName() {
     return "randomStock";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public RandomStockGraphQLQuery build() {
      return new RandomStockGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
