package com.sample.graphql.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MobileAppsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MobileAppsProjectionRoot() {
    super(null, null, java.util.Optional.of("MobileApp"));
  }

  public AuthorProjection<MobileAppsProjectionRoot<PARENT, ROOT>, MobileAppsProjectionRoot<PARENT, ROOT>> author(
      ) {
    AuthorProjection<MobileAppsProjectionRoot<PARENT, ROOT>, MobileAppsProjectionRoot<PARENT, ROOT>> projection = new AuthorProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public MobileAppCategoryProjection<MobileAppsProjectionRoot<PARENT, ROOT>, MobileAppsProjectionRoot<PARENT, ROOT>> category(
      ) {
    MobileAppCategoryProjection<MobileAppsProjectionRoot<PARENT, ROOT>, MobileAppsProjectionRoot<PARENT, ROOT>> projection = new MobileAppCategoryProjection<>(this, this);    
    getFields().put("category", projection);
    return projection;
  }

  public MobileAppsProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MobileAppsProjectionRoot<PARENT, ROOT> version() {
    getFields().put("version", null);
    return this;
  }

  public MobileAppsProjectionRoot<PARENT, ROOT> platform() {
    getFields().put("platform", null);
    return this;
  }

  public MobileAppsProjectionRoot<PARENT, ROOT> appId() {
    getFields().put("appId", null);
    return this;
  }

  public MobileAppsProjectionRoot<PARENT, ROOT> releaseDate() {
    getFields().put("releaseDate", null);
    return this;
  }

  public MobileAppsProjectionRoot<PARENT, ROOT> downloaded() {
    getFields().put("downloaded", null);
    return this;
  }

  public MobileAppsProjectionRoot<PARENT, ROOT> homepage() {
    getFields().put("homepage", null);
    return this;
  }
}
