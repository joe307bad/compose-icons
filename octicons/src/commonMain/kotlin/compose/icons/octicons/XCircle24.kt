package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.XCircle24: ImageVector
    get() {
        if (_xCircle24 != null) {
            return _xCircle24!!
        }
        _xCircle24 = Builder(name = "XCircle24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.036f, 7.976f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineTo(10.939f, 12.0f)
                lineToRelative(-2.963f, 2.963f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineTo(12.0f, 13.06f)
                lineToRelative(2.963f, 2.964f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.061f, -1.06f)
                lineTo(13.061f, 12.0f)
                lineToRelative(2.963f, -2.964f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(12.0f, 10.939f)
                lineTo(9.036f, 7.976f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                reflectiveCurveToRelative(4.925f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.925f, 11.0f, -11.0f)
                reflectiveCurveTo(18.075f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(2.5f, 12.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, true, true, 19.0f, 0.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, -19.0f, 0.0f)
                close()
            }
        }
        .build()
        return _xCircle24!!
    }

private var _xCircle24: ImageVector? = null
