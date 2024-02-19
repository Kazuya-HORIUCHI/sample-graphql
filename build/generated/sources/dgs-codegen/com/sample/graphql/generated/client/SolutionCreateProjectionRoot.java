package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SolutionCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SolutionCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("SolutionResponse"));
  }

  public SolutionProjection<SolutionCreateProjectionRoot<PARENT, ROOT>, SolutionCreateProjectionRoot<PARENT, ROOT>> solution(
      ) {
    SolutionProjection<SolutionCreateProjectionRoot<PARENT, ROOT>, SolutionCreateProjectionRoot<PARENT, ROOT>> projection = new SolutionProjection<>(this, this);    
    getFields().put("solution", projection);
    return projection;
  }
}
