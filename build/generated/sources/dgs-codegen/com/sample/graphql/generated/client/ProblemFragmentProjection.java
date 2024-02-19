package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ProblemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProblemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Problem"));
  }

  public UserProjection<ProblemFragmentProjection<PARENT, ROOT>, ROOT> author() {
     UserProjection<ProblemFragmentProjection<PARENT, ROOT>, ROOT> projection = new UserProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public SolutionProjection<ProblemFragmentProjection<PARENT, ROOT>, ROOT> solutions() {
     SolutionProjection<ProblemFragmentProjection<PARENT, ROOT>, ROOT> projection = new SolutionProjection<>(this, getRoot());
     getFields().put("solutions", projection);
     return projection;
  }

  public ProblemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProblemFragmentProjection<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public ProblemFragmentProjection<PARENT, ROOT> prettyCreateDateTime() {
    getFields().put("prettyCreateDateTime", null);
    return this;
  }

  public ProblemFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProblemFragmentProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public ProblemFragmentProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProblemFragmentProjection<PARENT, ROOT> solutionCount() {
    getFields().put("solutionCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Problem {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
