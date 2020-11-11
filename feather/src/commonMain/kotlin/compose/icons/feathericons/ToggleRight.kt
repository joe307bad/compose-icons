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

public val FeatherIcons.ToggleRight: VectorAsset
    get() {
        if (_toggleRight != null) {
            return _toggleRight!!
        }
        _toggleRight = VectorAssetBuilder(name = "ToggleRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                lineTo(16.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 23.0f, 12.0f)
                lineTo(23.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 1.0f, 12.0f)
                lineTo(1.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 8.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
        .build()
        return _toggleRight!!
    }

private var _toggleRight: VectorAsset? = null
