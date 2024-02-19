package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class AdditionalOnRequestGraphQLQuery extends GraphQLQuery {
  public AdditionalOnRequestGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public AdditionalOnRequestGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "additionalOnRequest";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public AdditionalOnRequestGraphQLQuery build() {
      return new AdditionalOnRequestGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
