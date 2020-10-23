package io.qameta.allure;

import java.lang.annotation.Annotation;

public class DummyLink implements Link {

  private final String name;
  private final String type;
  private final String url;
  private final String value;

  public DummyLink(String name, String type, String url, String value) {
    this.name = name;
    this.type = type;
    this.url = url;
    this.value = value;
  }

  @Override
  public Class<? extends Annotation> annotationType() {
    return io.qameta.allure.Link.class;
  }

  @Override
  public String value() {
    return value;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String url() {
    return url;
  }

  @Override
  public String type() {
    return type;
  }
}
