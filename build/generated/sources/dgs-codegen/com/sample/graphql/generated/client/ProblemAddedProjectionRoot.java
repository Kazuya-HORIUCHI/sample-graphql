package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProblemAddedProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProblemAddedProjectionRoot() {
    super(null, null, java.util.Optional.of("Problem"));
  }

  public UserProjection<ProblemAddedProjectionRoot<PARENT, ROOT>, ProblemAddedProjectionRoot<PARENT, ROOT>> author(
      ) {
    UserProjection<ProblemAddedProjectionRoot<PARENT, ROOT>, ProblemAddedProjectionRoot<PARENT, ROOT>> projection = new UserProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public SolutionProjection<ProblemAddedProjectionRoot<PARENT, ROOT>, ProblemAddedProjectionRoot<PARENT, ROOT>> solutions(
      ) {
    SolutionProjection<ProblemAddedProjectionRoot<PARENT, ROOT>, ProblemAddedProjectionRoot<PARENT, ROOT>> projection = new SolutionProjection<>(this, this);    
    getFields().put("solutions", projection);
    return projection;
  }

  public ProblemAddedProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProblemAddedProjectionRoot<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public ProblemAddedProjectionRoot<PARENT, ROOT> prettyCreateDateTime() {
    getFields().put("prettyCreateDateTime", null);
    return this;
  }

  public ProblemAddedProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProblemAddedProjectionRoot<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public ProblemAddedProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProblemAddedProjectionRoot<PARENT, ROOT> solutionCount() {
    getFields().put("solutionCount", null);
    return this;
  }
}
