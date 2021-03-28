package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Zap16: ImageVector
    get() {
        if (_zap16 != null) {
            return _zap16!!
        }
        _zap16 = Builder(name = "Zap16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.561f, 1.5f)
                arcToRelative(0.016f, 0.016f, 0.0f, false, false, -0.01f, 0.004f)
                lineTo(3.286f, 8.571f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 3.462f, 9.0f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.694f, 1.034f)
                lineToRelative(-1.713f, 4.188f)
                lineToRelative(6.982f, -6.793f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 12.538f, 7.0f)
                horizontalLineTo(9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.683f, -1.06f)
                lineToRelative(2.008f, -4.418f)
                lineToRelative(0.003f, -0.006f)
                arcToRelative(0.02f, 0.02f, 0.0f, false, false, -0.004f, -0.009f)
                arcToRelative(0.02f, 0.02f, 0.0f, false, false, -0.006f, -0.006f)
                lineTo(10.56f, 1.5f)
                close()
                moveTo(9.504f, 0.43f)
                arcToRelative(1.516f, 1.516f, 0.0f, false, true, 2.437f, 1.713f)
                lineTo(10.415f, 5.5f)
                horizontalLineToRelative(2.123f)
                curveToRelative(1.57f, 0.0f, 2.346f, 1.909f, 1.22f, 3.004f)
                lineToRelative(-7.34f, 7.142f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -0.871f, 0.354f)
                horizontalLineToRelative(-0.302f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.157f, -1.723f)
                lineTo(5.633f, 10.5f)
                horizontalLineTo(3.462f)
                curveToRelative(-1.57f, 0.0f, -2.346f, -1.909f, -1.22f, -3.004f)
                lineTo(9.503f, 0.429f)
                close()
            }
        }
        .build()
        return _zap16!!
    }

private var _zap16: ImageVector? = null
