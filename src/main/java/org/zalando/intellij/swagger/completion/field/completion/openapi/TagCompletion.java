package org.zalando.intellij.swagger.completion.field.completion.openapi;

import com.intellij.codeInsight.completion.CompletionResultSet;
import org.zalando.intellij.swagger.completion.CompletionHelper;
import org.zalando.intellij.swagger.completion.field.FieldCompletion;
import org.zalando.intellij.swagger.completion.field.model.common.CommonFields;

class TagCompletion extends FieldCompletion {

  TagCompletion(
      final CompletionHelper completionHelper, final CompletionResultSet completionResultSet) {
    super(completionHelper, completionResultSet);
  }

  public void fill() {
    CommonFields.tag().forEach(this::addUnique);
  }
}
