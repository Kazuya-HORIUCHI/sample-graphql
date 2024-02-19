package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SolutionVoteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SolutionVoteProjectionRoot() {
    super(null, null, java.util.Optional.of("SolutionResponse"));
  }

  public SolutionProjection<SolutionVoteProjectionRoot<PARENT, ROOT>, SolutionVoteProjectionRoot<PARENT, ROOT>> solution(
      ) {
    SolutionProjection<SolutionVoteProjectionRoot<PARENT, ROOT>, SolutionVoteProjectionRoot<PARENT, ROOT>> projection = new SolutionProjection<>(this, this);    
    getFields().put("solution", projection);
    return projection;
  }
}
