package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PetsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PetsProjectionRoot() {
    super(null, null, java.util.Optional.of("Pet"));
  }

  public PetFoodTypeProjection<PetsProjectionRoot<PARENT, ROOT>, PetsProjectionRoot<PARENT, ROOT>> food(
      ) {
    PetFoodTypeProjection<PetsProjectionRoot<PARENT, ROOT>, PetsProjectionRoot<PARENT, ROOT>> projection = new PetFoodTypeProjection<>(this, this);    
    getFields().put("food", projection);
    return projection;
  }

  public PetsProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public PetsProjectionRoot<PARENT, ROOT> breed() {
    getFields().put("breed", null);
    return this;
  }

  public DogFragmentProjection<PetsProjectionRoot<PARENT, ROOT>, PetsProjectionRoot<PARENT, ROOT>> onDog(
      ) {
    DogFragmentProjection<PetsProjectionRoot<PARENT, ROOT>, PetsProjectionRoot<PARENT, ROOT>> fragment = new DogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CatFragmentProjection<PetsProjectionRoot<PARENT, ROOT>, PetsProjectionRoot<PARENT, ROOT>> onCat(
      ) {
    CatFragmentProjection<PetsProjectionRoot<PARENT, ROOT>, PetsProjectionRoot<PARENT, ROOT>> fragment = new CatFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
