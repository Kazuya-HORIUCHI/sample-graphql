package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.SolutionVoteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class SolutionVoteGraphQLQuery extends GraphQLQuery {
  public SolutionVoteGraphQLQuery(SolutionVoteInput vote, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (vote != null || fieldsSet.contains("vote")) {
        getInput().put("vote", vote);
    }
  }

  public SolutionVoteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "solutionVote";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SolutionVoteInput vote;

    private String queryName;

    public SolutionVoteGraphQLQuery build() {
      return new SolutionVoteGraphQLQuery(vote, queryName, fieldsSet);
               
    }

    public Builder vote(SolutionVoteInput vote) {
      this.vote = vote;
      this.fieldsSet.add("vote");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
