package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.ReleaseHistoryInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class BooksByReleasedGraphQLQuery extends GraphQLQuery {
  public BooksByReleasedGraphQLQuery(ReleaseHistoryInput releasedInput, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (releasedInput != null || fieldsSet.contains("releasedInput")) {
        getInput().put("releasedInput", releasedInput);
    }
  }

  public BooksByReleasedGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "booksByReleased";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ReleaseHistoryInput releasedInput;

    private String queryName;

    public BooksByReleasedGraphQLQuery build() {
      return new BooksByReleasedGraphQLQuery(releasedInput, queryName, fieldsSet);
               
    }

    public Builder releasedInput(ReleaseHistoryInput releasedInput) {
      this.releasedInput = releasedInput;
      this.fieldsSet.add("releasedInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
