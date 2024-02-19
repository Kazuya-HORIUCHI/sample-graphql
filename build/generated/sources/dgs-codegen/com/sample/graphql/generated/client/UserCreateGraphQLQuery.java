package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.UserCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class UserCreateGraphQLQuery extends GraphQLQuery {
  public UserCreateGraphQLQuery(UserCreateInput user, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (user != null || fieldsSet.contains("user")) {
        getInput().put("user", user);
    }
  }

  public UserCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "userCreate";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private UserCreateInput user;

    private String queryName;

    public UserCreateGraphQLQuery build() {
      return new UserCreateGraphQLQuery(user, queryName, fieldsSet);
               
    }

    public Builder user(UserCreateInput user) {
      this.user = user;
      this.fieldsSet.add("user");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
