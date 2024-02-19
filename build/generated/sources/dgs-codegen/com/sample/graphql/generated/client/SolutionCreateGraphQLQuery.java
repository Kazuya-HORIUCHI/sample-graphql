package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.SolutionCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class SolutionCreateGraphQLQuery extends GraphQLQuery {
  public SolutionCreateGraphQLQuery(SolutionCreateInput solution, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (solution != null || fieldsSet.contains("solution")) {
        getInput().put("solution", solution);
    }
  }

  public SolutionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "solutionCreate";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SolutionCreateInput solution;

    private String queryName;

    public SolutionCreateGraphQLQuery build() {
      return new SolutionCreateGraphQLQuery(solution, queryName, fieldsSet);
               
    }

    public Builder solution(SolutionCreateInput solution) {
      this.solution = solution;
      this.fieldsSet.add("solution");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
