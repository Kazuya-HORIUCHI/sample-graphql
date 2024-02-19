package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UserAuthTokenProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UserAuthTokenProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UserAuthToken"));
  }

  public UserAuthTokenProjection<PARENT, ROOT> authToken() {
    getFields().put("authToken", null);
    return this;
  }

  public UserAuthTokenProjection<PARENT, ROOT> expiryTime() {
    getFields().put("expiryTime", null);
    return this;
  }
}
