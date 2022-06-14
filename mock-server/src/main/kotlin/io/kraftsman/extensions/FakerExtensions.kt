package io.kraftsman.extensions

import io.github.serpro69.kfaker.provider.Commerce

enum class ThumbnailTheme {
    MOVIE,
    GAME,
    ALBUM,
    BOOK,
    FACE,
    FASHION,
    SHOES,
    WATCH,
    FURNITURE,
    PIZZA,
    BURGER,
    DRINK,
    CAR,
    HOUSE,
    RANDOM,
}

fun Commerce.thumbnail(
    theme: ThumbnailTheme = ThumbnailTheme.RANDOM,
    width: Int = 100,
    height: Int = 100
): String {
    val path = if (theme == ThumbnailTheme.RANDOM) {
        ""
    } else {
        "/${theme.name.lowercase()}"
    }
    return "https://api.lorem.space/image" +
            "$path?w=$width&h=$height"
}
