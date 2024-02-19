package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CatFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CatFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Cat"));
  }

  public PetFoodTypeProjection<CatFragmentProjection<PARENT, ROOT>, ROOT> food() {
     PetFoodTypeProjection<CatFragmentProjection<PARENT, ROOT>, ROOT> projection = new PetFoodTypeProjection<>(this, getRoot());
     getFields().put("food", projection);
     return projection;
  }

  public CatFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CatFragmentProjection<PARENT, ROOT> breed() {
    getFields().put("breed", null);
    return this;
  }

  public CatFragmentProjection<PARENT, ROOT> registry() {
    getFields().put("registry", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Cat {");
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
