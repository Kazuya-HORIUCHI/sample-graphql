package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UserProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UserProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("User"));
  }

  public ProblemProjection<UserProjection<PARENT, ROOT>, ROOT> problems() {
     ProblemProjection<UserProjection<PARENT, ROOT>, ROOT> projection = new ProblemProjection<>(this, getRoot());
     getFields().put("problems", projection);
     return projection;
  }

  public UserProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public UserProjection<PARENT, ROOT> username() {
    getFields().put("username", null);
    return this;
  }

  public UserProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public UserProjection<PARENT, ROOT> avatar() {
    getFields().put("avatar", null);
    return this;
  }

  public UserProjection<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public UserProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }
}
