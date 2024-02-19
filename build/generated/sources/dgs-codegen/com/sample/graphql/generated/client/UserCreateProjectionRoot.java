package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UserCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UserCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("UserResponse"));
  }

  public UserProjection<UserCreateProjectionRoot<PARENT, ROOT>, UserCreateProjectionRoot<PARENT, ROOT>> user(
      ) {
    UserProjection<UserCreateProjectionRoot<PARENT, ROOT>, UserCreateProjectionRoot<PARENT, ROOT>> projection = new UserProjection<>(this, this);    
    getFields().put("user", projection);
    return projection;
  }

  public UserAuthTokenProjection<UserCreateProjectionRoot<PARENT, ROOT>, UserCreateProjectionRoot<PARENT, ROOT>> authToken(
      ) {
    UserAuthTokenProjection<UserCreateProjectionRoot<PARENT, ROOT>, UserCreateProjectionRoot<PARENT, ROOT>> projection = new UserAuthTokenProjection<>(this, this);    
    getFields().put("authToken", projection);
    return projection;
  }
}
