// This is a generated file. Not intended for manual editing.
package com.kplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kplugin.psi.KTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kplugin.psi.*;

public class KListOptionsImpl extends ASTWrapperPsiElement implements KListOptions {

  public KListOptionsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KVisitor visitor) {
    visitor.visitListOptions(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KVisitor) accept((KVisitor)visitor);
    else super.accept(visitor);
  }

}
