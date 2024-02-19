package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class SolutionVoteChangedGraphQLQuery extends GraphQLQuery {
  public SolutionVoteChangedGraphQLQuery(String solutionId, String queryName,
      Set<String> fieldsSet) {
    super("subscription", queryName);
    if (solutionId != null || fieldsSet.contains("solutionId")) {
        getInput().put("solutionId", solutionId);
    }
  }

  public SolutionVoteChangedGraphQLQuery() {
    super("subscription");
  }

  @Override
  public String getOperationName() {
     return "solutionVoteChanged";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String solutionId;

    private String queryName;

    public SolutionVoteChangedGraphQLQuery build() {
      return new SolutionVoteChangedGraphQLQuery(solutionId, queryName, fieldsSet);
               
    }

    public Builder solutionId(String solutionId) {
      this.solutionId = solutionId;
      this.fieldsSet.add("solutionId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
