package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProblemCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProblemCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ProblemResponse"));
  }

  public ProblemProjection<ProblemCreateProjectionRoot<PARENT, ROOT>, ProblemCreateProjectionRoot<PARENT, ROOT>> problem(
      ) {
    ProblemProjection<ProblemCreateProjectionRoot<PARENT, ROOT>, ProblemCreateProjectionRoot<PARENT, ROOT>> projection = new ProblemProjection<>(this, this);    
    getFields().put("problem", projection);
    return projection;
  }
}
