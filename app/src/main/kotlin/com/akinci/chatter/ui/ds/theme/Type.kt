package com.akinci.chatter.ui.ds.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.unit.sp
import com.akinci.chatter.R

val swash = TextStyle(
    fontFamily = FontFamily(
        Font(resId = R.font.berkshire_swash_regular)
    ),
)

val SwashTypography = Typography(
    displayLarge = swash.copy(
        lineHeight = 62.sp,
        fontSize = 56.sp,
        letterSpacing = 0.sp,
        fontWeight = W700,
    ),
    displayMedium = swash.copy(
        lineHeight = 52.sp,
        fontSize = 45.sp,
        letterSpacing = 0.sp,
        fontWeight = W700,
    ),
    bodyLarge = swash.copy(
        lineHeight = 24.sp,
        fontSize = 17.sp,
        letterSpacing = 0.sp,
        fontWeight = W400,
    ),
)

val roboto = TextStyle(
    fontFamily = FontFamily(
        Font(resId = R.font.roboto_regular)
    ),
)

val AppTypography = Typography(
    displayLarge = roboto.copy(
        lineHeight = 62.sp,
        fontSize = 56.sp,
        letterSpacing = 0.sp,
        fontWeight = W700,
    ),
    displayMedium = roboto.copy(
        lineHeight = 52.sp,
        fontSize = 45.sp,
        letterSpacing = 0.sp,
        fontWeight = W700,
    ),
    displaySmall = roboto.copy(
        lineHeight = 45.sp,
        fontSize = 39.sp,
        letterSpacing = 0.sp,
        fontWeight = W700,
    ),
    headlineLarge = roboto.copy(
        lineHeight = 40.sp,
        fontSize = 32.sp,
        letterSpacing = 0.sp,
        fontWeight = W700,
    ),
    headlineMedium = roboto.copy(
        lineHeight = 36.sp,
        fontSize = 28.sp,
        letterSpacing = 0.sp,
        fontWeight = W700,
    ),
    headlineSmall = roboto.copy(
        lineHeight = 32.sp,
        fontSize = 26.sp,
        letterSpacing = 0.sp,
        fontWeight = W700,
    ),
    titleLarge = roboto.copy(
        lineHeight = 27.sp,
        fontSize = 20.sp,
        letterSpacing = 0.sp,
        fontWeight = W700,
    ),
    titleMedium = roboto.copy(
        lineHeight = 24.sp,
        fontSize = 17.sp,
        letterSpacing = 0.sp,
        fontWeight = W700,
    ),
    titleSmall = roboto.copy(
        lineHeight = 22.sp,
        fontSize = 15.sp,
        letterSpacing = 0.sp,
        fontWeight = W400,
    ),
    labelLarge = roboto.copy(
        lineHeight = 20.sp,
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        fontWeight = W400,
    ),
    labelMedium = roboto.copy(
        lineHeight = 19.sp,
        fontSize = 12.sp,
        letterSpacing = 0.sp,
        fontWeight = W400,
    ),
    labelSmall = roboto.copy(
        lineHeight = 16.sp,
        fontSize = 11.sp,
        letterSpacing = (0.5).sp,
        fontWeight = W400,
    ),
    bodyLarge = roboto.copy(
        lineHeight = 24.sp,
        fontSize = 17.sp,
        letterSpacing = 0.sp,
        fontWeight = W400,
    ),
    bodyMedium = roboto.copy(
        lineHeight = 22.sp,
        fontSize = 15.sp,
        letterSpacing = 0.sp,
        fontWeight = W400,
    ),
    bodySmall = roboto.copy(
        lineHeight = 19.sp,
        fontSize = 12.sp,
        letterSpacing = 0.sp,
        fontWeight = W400,
    ),
)

val Typography.bodyLargeBold: TextStyle
    get() = AppTypography.bodyLarge.copy(fontWeight = W700)

val Typography.bodyLarge_swash: TextStyle
    get() = SwashTypography.bodyLarge

val Typography.displayLarge_swash: TextStyle
    get() = SwashTypography.displayLarge

val Typography.displayMedium_swash: TextStyle
    get() = SwashTypography.displayMedium
