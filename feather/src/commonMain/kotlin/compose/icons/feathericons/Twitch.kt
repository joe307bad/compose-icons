package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Twitch: VectorAsset
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = VectorAssetBuilder(name = "Twitch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(4.0f, -4.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineTo(7.0f)
                moveTo(16.0f, 11.0f)
                verticalLineTo(7.0f)
            }
        }
        .build()
        return _twitch!!
    }

private var _twitch: VectorAsset? = null
