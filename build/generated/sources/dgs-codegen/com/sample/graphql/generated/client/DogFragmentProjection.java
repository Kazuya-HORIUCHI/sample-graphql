package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DogFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DogFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Dog"));
  }

  public PetFoodTypeProjection<DogFragmentProjection<PARENT, ROOT>, ROOT> food() {
     PetFoodTypeProjection<DogFragmentProjection<PARENT, ROOT>, ROOT> projection = new PetFoodTypeProjection<>(this, getRoot());
     getFields().put("food", projection);
     return projection;
  }

  public DogFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DogFragmentProjection<PARENT, ROOT> breed() {
    getFields().put("breed", null);
    return this;
  }

  public DogFragmentProjection<PARENT, ROOT> size() {
    getFields().put("size", null);
    return this;
  }

  public DogFragmentProjection<PARENT, ROOT> coatLength() {
    getFields().put("coatLength", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Dog {");
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
