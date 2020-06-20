package com.vanniktech.emoji.googlecompat.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.googlecompat.R;
import com.vanniktech.emoji.googlecompat.GoogleCompatEmoji;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class SymbolsCategory implements EmojiCategory {
  private static final GoogleCompatEmoji[] EMOJIS = CategoryUtils.concatAll(SymbolsCategoryChunk0.get());

  @Override @NonNull public GoogleCompatEmoji[] getEmojis() {
    return EMOJIS;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_googlecompat_category_symbols;
  }

  @Override @StringRes public int getCategoryName() {
    return R.string.emoji_googlecompat_category_symbols;
  }
}
