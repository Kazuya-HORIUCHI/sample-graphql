package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UserLoginProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UserLoginProjectionRoot() {
    super(null, null, java.util.Optional.of("UserResponse"));
  }

  public UserProjection<UserLoginProjectionRoot<PARENT, ROOT>, UserLoginProjectionRoot<PARENT, ROOT>> user(
      ) {
    UserProjection<UserLoginProjectionRoot<PARENT, ROOT>, UserLoginProjectionRoot<PARENT, ROOT>> projection = new UserProjection<>(this, this);    
    getFields().put("user", projection);
    return projection;
  }

  public UserAuthTokenProjection<UserLoginProjectionRoot<PARENT, ROOT>, UserLoginProjectionRoot<PARENT, ROOT>> authToken(
      ) {
    UserAuthTokenProjection<UserLoginProjectionRoot<PARENT, ROOT>, UserLoginProjectionRoot<PARENT, ROOT>> projection = new UserAuthTokenProjection<>(this, this);    
    getFields().put("authToken", projection);
    return projection;
  }
}
