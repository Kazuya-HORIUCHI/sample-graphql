package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.UserLoginInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class UserLoginGraphQLQuery extends GraphQLQuery {
  public UserLoginGraphQLQuery(UserLoginInput user, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (user != null || fieldsSet.contains("user")) {
        getInput().put("user", user);
    }
  }

  public UserLoginGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "userLogin";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private UserLoginInput user;

    private String queryName;

    public UserLoginGraphQLQuery build() {
      return new UserLoginGraphQLQuery(user, queryName, fieldsSet);
               
    }

    public Builder user(UserLoginInput user) {
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
