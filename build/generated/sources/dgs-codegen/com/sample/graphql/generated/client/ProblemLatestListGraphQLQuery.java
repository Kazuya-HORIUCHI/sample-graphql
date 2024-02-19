package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class ProblemLatestListGraphQLQuery extends GraphQLQuery {
  public ProblemLatestListGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public ProblemLatestListGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "problemLatestList";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public ProblemLatestListGraphQLQuery build() {
      return new ProblemLatestListGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
