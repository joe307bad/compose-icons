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

public val FeatherIcons.Octagon: VectorAsset
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = VectorAssetBuilder(name = "Octagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.86f, 2.0f)
                lineToRelative(8.28f, 0.0f)
                lineToRelative(5.86f, 5.86f)
                lineToRelative(0.0f, 8.28f)
                lineToRelative(-5.86f, 5.86f)
                lineToRelative(-8.28f, 0.0f)
                lineToRelative(-5.86f, -5.86f)
                lineToRelative(0.0f, -8.28f)
                lineToRelative(5.86f, -5.86f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: VectorAsset? = null
