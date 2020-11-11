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

public val FeatherIcons.Shield: VectorAsset
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = VectorAssetBuilder(name = "Shield", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                reflectiveCurveToRelative(8.0f, -4.0f, 8.0f, -10.0f)
                verticalLineTo(5.0f)
                lineToRelative(-8.0f, -3.0f)
                lineToRelative(-8.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 6.0f, 8.0f, 10.0f, 8.0f, 10.0f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: VectorAsset? = null
