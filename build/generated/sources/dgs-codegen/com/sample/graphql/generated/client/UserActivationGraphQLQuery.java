package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.sample.graphql.generated.types.UserActivationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class UserActivationGraphQLQuery extends GraphQLQuery {
  public UserActivationGraphQLQuery(UserActivationInput user, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (user != null || fieldsSet.contains("user")) {
        getInput().put("user", user);
    }
  }

  public UserActivationGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "userActivation";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private UserActivationInput user;

    private String queryName;

    public UserActivationGraphQLQuery build() {
      return new UserActivationGraphQLQuery(user, queryName, fieldsSet);
               
    }

    public Builder user(UserActivationInput user) {
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
