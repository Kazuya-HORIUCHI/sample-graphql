package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SolutionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SolutionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Solution"));
  }

  public SolutionCategoryProjection<SolutionFragmentProjection<PARENT, ROOT>, ROOT> category() {
     SolutionCategoryProjection<SolutionFragmentProjection<PARENT, ROOT>, ROOT> projection = new SolutionCategoryProjection<>(this, getRoot());
     getFields().put("category", projection);
     return projection;
  }

  public UserProjection<SolutionFragmentProjection<PARENT, ROOT>, ROOT> author() {
     UserProjection<SolutionFragmentProjection<PARENT, ROOT>, ROOT> projection = new UserProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public SolutionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public SolutionFragmentProjection<PARENT, ROOT> createDateTime() {
    getFields().put("createDateTime", null);
    return this;
  }

  public SolutionFragmentProjection<PARENT, ROOT> prettyCreateDateTime() {
    getFields().put("prettyCreateDateTime", null);
    return this;
  }

  public SolutionFragmentProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public SolutionFragmentProjection<PARENT, ROOT> voteAsGoodCount() {
    getFields().put("voteAsGoodCount", null);
    return this;
  }

  public SolutionFragmentProjection<PARENT, ROOT> voteAsBadCount() {
    getFields().put("voteAsBadCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Solution {");
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
