package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UserActivationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UserActivationProjectionRoot() {
    super(null, null, java.util.Optional.of("UserActivationResponse"));
  }

  public UserActivationProjectionRoot<PARENT, ROOT> isActive() {
    getFields().put("isActive", null);
    return this;
  }
}
