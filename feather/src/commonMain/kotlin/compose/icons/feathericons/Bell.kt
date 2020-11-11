package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Bell: VectorAsset
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = VectorAssetBuilder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 8.0f)
                curveToRelative(0.0f, 7.0f, -3.0f, 9.0f, -3.0f, 9.0f)
                horizontalLineToRelative(18.0f)
                reflectiveCurveToRelative(-3.0f, -2.0f, -3.0f, -9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.73f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.46f, 0.0f)
            }
        }
        .build()
        return _bell!!
    }

private var _bell: VectorAsset? = null
