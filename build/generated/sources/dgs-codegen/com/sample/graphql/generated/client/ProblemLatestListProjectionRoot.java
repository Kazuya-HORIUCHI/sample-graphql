package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProblemLatestListProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProblemLatestListProjectionRoot() {
    super(null, null, java.util.Optional.of("Problem"));
  }

  public UserProjection<ProblemLatestListProjectionRoot<PARENT, ROOT>, ProblemLatestListProjectionRoot<PARENT, ROOT>> author(
      ) {
    UserProjection<ProblemLatestListProjectionRoot<PARENT, ROOT>, ProblemLatestListProjectionRoot<PARENT, ROOT>> projection = new UserProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public SolutionProjection<ProblemLatestListProjectionRoot<PARENT, ROOT>, ProblemLatestListProjectionRoot<PARENT, ROOT>> solutions(
      ) {
    SolutionProjection<ProblemLatestListProjectionRoot<PARENT, ROOT>, ProblemLatestListProjectionRoot<PARENT, ROOT>> projection = new SolutionProjection<>(this, this);    
    getFields().put("solutions", projection);
    return projection;
  }

  public ProblemLatestListProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProblemLatestListProjectionRoot<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public ProblemLatestListProjectionRoot<PARENT, ROOT> prettyCreateDateTime() {
    getFields().put("prettyCreateDateTime", null);
    return this;
  }

  public ProblemLatestListProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProblemLatestListProjectionRoot<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public ProblemLatestListProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProblemLatestListProjectionRoot<PARENT, ROOT> solutionCount() {
    getFields().put("solutionCount", null);
    return this;
  }
}
