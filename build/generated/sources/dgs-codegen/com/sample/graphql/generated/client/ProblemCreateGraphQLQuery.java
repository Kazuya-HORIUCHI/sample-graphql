package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.ProblemCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class ProblemCreateGraphQLQuery extends GraphQLQuery {
  public ProblemCreateGraphQLQuery(ProblemCreateInput problem, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (problem != null || fieldsSet.contains("problem")) {
        getInput().put("problem", problem);
    }
  }

  public ProblemCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "problemCreate";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProblemCreateInput problem;

    private String queryName;

    public ProblemCreateGraphQLQuery build() {
      return new ProblemCreateGraphQLQuery(problem, queryName, fieldsSet);
               
    }

    public Builder problem(ProblemCreateInput problem) {
      this.problem = problem;
      this.fieldsSet.add("problem");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
