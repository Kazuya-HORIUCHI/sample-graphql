package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MeProjectionRoot() {
    super(null, null, java.util.Optional.of("User"));
  }

  public ProblemProjection<MeProjectionRoot<PARENT, ROOT>, MeProjectionRoot<PARENT, ROOT>> problems(
      ) {
    ProblemProjection<MeProjectionRoot<PARENT, ROOT>, MeProjectionRoot<PARENT, ROOT>> projection = new ProblemProjection<>(this, this);    
    getFields().put("problems", projection);
    return projection;
  }

  public MeProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MeProjectionRoot<PARENT, ROOT> username() {
    getFields().put("username", null);
    return this;
  }

  public MeProjectionRoot<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public MeProjectionRoot<PARENT, ROOT> avatar() {
    getFields().put("avatar", null);
    return this;
  }

  public MeProjectionRoot<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public MeProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }
}
